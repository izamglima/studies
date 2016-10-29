using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication1
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] arr = { 800, 11, 50, 771, 649, 770, 240, 9 };

            int temp = 0;

            for (int i = 0; i < arr.Length; i++) {
                Console.WriteLine("Teste passagem " + i  + arr[i] + " ");
                 for (int sort = 0; sort < arr.Length - 1; sort++) {

                    if (arr[sort] > arr[sort + 1]) {
                        temp = arr[sort + 1]; //armazena no temp o menor nº
                        arr[sort + 1] = arr[sort]; //passa o maior para a proxima casa
                        arr[sort] = temp; //recebe o menor na casa anterior
                    }
                }
            }

            for (int i = 0; i < arr.Length; i++){
                Console.Write(arr[i] + " ");
            }

            Console.ReadKey();
        }
    }
}