using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Calculadora
{
	class Program
	{
		static void Main(string[] args)
		{
			// Crie um objeto para a classe Calculadora
			Calculadora objcalc = new Calculadora();
			
			Console.Write("Entre com o primeiro valor: ");
			decimal valor1 = decimal.Parse(Console.ReadLine());
			decimal valor2 = decimal.Parse(Console.ReadLine());
			
			// Escolha a operacao matematica
			
			Console.Write("Escolha a operacao: ");
			Console.WriteLine("1 - Soma");
			Console.WriteLine("2 - Subtracao");
			Console.WriteLine("3 - Multiplicar");
			Console.WriteLine("4 - Dividir");
			
			// Lendo a operacao escolhida
			int operacao = int.Parse(Console.ReadLine());
			
			// Implemente condições para chamar os metodos
			
			if (operacao == 1)
			{
				// chame o metodo Somar
				objcalc.Somar(valor1, valor2);
			}
			else if (operacao == 2)
			{
				objcalc.Subtrai(valor1, valor2);
			}
			else if (operacao == 3)
			{
				objcalc.Multiplica(valor1, valor2);
			}
			else if (operacao == 4)
			{
				objcalc.Divisao(valor1, valor2);
			}
			
			// Mostrando o resultado
			Console.WriteLine(objcalc.resultado);
			
			Console.ReadKey();
			
		}
	}
	class Calculadora
	{
		public decimal resultado;
		
		public void Somar(decimal valor1, decimal valor2)
		{
			this.resultado = valor1 + valor2;
		}
		public void Subtrai(decimal valor1, decimal valor2)
		{
			this.resultado = valor1 - valor2;
		}
		public void Multiplica(decimal valor1, decimal valor2)
		{
			this.resultado = valor1 * valor2;
		}
		public void Divisao(decimal valor1, decimal valor2)
		{
			this.resultado = valor1 / valor2;
		}
		
	}
}