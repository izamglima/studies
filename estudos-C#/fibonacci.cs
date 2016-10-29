using System.IO;
using System;

class Program
{
    static void Main()
    {
        int a = 0, b = 1;
        for(int i = 0; i < 30; i++)
        {
            int auxiliar = a + b;
            a = b;
            b = auxiliar;
            Console.WriteLine(auxiliar);
        }
    }
}