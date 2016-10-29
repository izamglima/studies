using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace exercicio
{
    class Program
    {
        static void Main(string[] args)
        {
            int valorMax = 3;

            int[] notas = new int[] { 2, 4, 6};
            int somatorio = 0, media = 0;

            for (int i = 0; i < valorMax; i++)
            {
                somatorio += notas[i];
            }

            media = somatorio / valorMax;

            double temp = 0 , desvioMedio = 0;

            for (int i = 0; i < valorMax; i++)
            {
                temp += Math.Abs(media - notas[i]);
            }
            desvioMedio = temp / valorMax;
            Console.WriteLine("Media é " + media);
            Console.WriteLine("Desvio: " + desvioMedio);
            Console.ReadKey();
        }
    }
}