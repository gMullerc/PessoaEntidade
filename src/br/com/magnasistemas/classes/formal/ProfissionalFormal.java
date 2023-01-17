package br.com.magnasistemas.classes.formal;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

import br.com.magnasistemas.classes.Profissional;

public abstract class ProfissionalFormal extends Profissional {

	protected int horasTrabalhadas;

	protected String nomeDaEmpresa;
	protected LocalDate diaDeInicio;

	public void baterPonto(LocalTime horaInicial, LocalTime horaFinal) {

		int somaInicial = horaInicial.getHour() * 60 + horaInicial.getMinute() + horaInicial.getSecond();

		int somaFinal = horaFinal.getHour() * 60 + horaFinal.getMinute() + horaFinal.getSecond();

		if (somaFinal > somaInicial) {
			int resultado = somaFinal - somaInicial;
			int aux = resultado % 60;

			this.horasTrabalhadas = resultado / 60;
			System.out.printf("%d horas e %d minutos\n", this.horasTrabalhadas, aux);

		} else if (somaFinal <= somaInicial) {
			int resultado = 1440 - somaInicial;
			resultado += somaFinal;

			int aux = resultado % 60;
			this.horasTrabalhadas = resultado / 60;
			System.out.printf("%d horas e %d minutos\n", this.horasTrabalhadas, aux);
		}
		descancoSemanal();
	}

	public boolean descancoSemanal() {
		if (this.horasTrabalhadas >= 40) {
			System.out.println("Descançando!!!....");
			this.horasTrabalhadas = 0;
			return true;
		} else {
			int faltante = 40 - this.horasTrabalhadas;
			System.out.printf("apenas mais %d horas para a folga...", faltante);
			return false;
		}

	}



	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public boolean tirarFerias() {
		LocalDate agora = LocalDate.now();

		int ano = agora.getYear();
		Month mes = agora.getMonth();
		int dia = agora.getDayOfMonth();

		int anoFerias = ano - this.diaDeInicio.getYear();
		System.out.println(anoFerias);
		int mesFerias = mes.compareTo(this.diaDeInicio.getMonth());

		if (anoFerias >= 1) {
			System.out.println("Tirando Ferias...");
			return true;
		} else {

			System.out.println("Ainda não é possível tirar as férias...");
			return false;
		}

	}

}
