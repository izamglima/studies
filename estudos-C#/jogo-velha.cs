namespace JogoDaVelha
{
    class Program
    {
        static string[,] jogo = new string[3, 3];

        static int rodada = 0, maxJogadas = 9, jogada = 0, vencedor = 0;
        public static void LimpaTabuleiro()
        {
            for (int i = 0; i <= 2; i++)
            {
                for (int j = 0; j <= 2; j++)
                {
                    jogo[i, j] = " ";
                }
            }
        }
        public static void MostrarTabuleiro()
        {

            Console.Write("                                 {0}  |  {1}  |  {2} \n", jogo[0,0], jogo[0,1], jogo[0,2]);
            Console.Write("                               -----|-----|-----\n");
            Console.Write("                                 {0}  |  {1}  |  {2} \n", jogo[1,0], jogo[1,1], jogo[1,2]);
            Console.Write("                               -----|-----|-----\n");
            Console.Write("                                 {0}  |  {1}  |  {2} \n", jogo[2,0], jogo[2,1], jogo[2,2]);
            Console.Write("\n");

        }
        public static void Jogo()
        {
            if ((rodada % 2) == 0)
            {
                Console.WriteLine("Jogada jogador 1: ");
                jogada = int.Parse(Console.ReadLine());
                switch (jogada)
                {
                    case 1:
                        if (jogo[2, 0] == "o" || jogo[2, 0] == "x")
                        {
                            Console.WriteLine("Jogada já feita! refaça sua jogada.");
                        }
                        else
                        {
                            jogo[2, 0] = "x";
                            rodada++;
                        }
                        break;
                    case 2:
                        if (jogo[2, 1] == "o" || jogo[2, 1] == "x")
                        {
                            Console.WriteLine("Jogada já feita! refaça sua jogada.");
                        }
                        else
                        {
                            jogo[2, 1] = "x";
                            rodada++;
                        }
                        break;
                    case 3:
                        if (jogo[2, 2] == "o" || jogo[2, 2] == "x")
                        {
                            Console.WriteLine("Jogada já feita! refaça sua jogada.");
                        }
                        else
                        {
                            jogo[2, 2] = "x";
                            rodada++;
                        }
                        break;
                    case 4:
                        if (jogo[1, 0] == "o" || jogo[1, 0] == "x")
                        {
                            Console.WriteLine("Jogada já feita! refaça sua jogada.");
                        }
                        else
                        {
                            jogo[1, 0] = "x";
                            rodada++;
                        }
                        break;
                    case 5:
                        if (jogo[1, 1] == "o" || jogo[1, 1] == "x")
                        {
                            Console.WriteLine("Jogada já feita! refaça sua jogada.");
                        }
                        else
                        {
                            jogo[1, 1] = "x";
                            rodada++;
                        }
                        break;
                    case 6:
                        if (jogo[1, 2] == "o" || jogo[1, 2] == "x")
                        {
                            Console.WriteLine("Jogada já feita! refaça sua jogada.");
                        }
                        else
                        {
                            jogo[1, 2] = "x";
                            rodada++;
                        }
                        break;
                    case 7:
                        if (jogo[0, 0] == "o" || jogo[0, 0] == "x")
                        {
                            Console.WriteLine("Jogada já feita! refaça sua jogada.");
                        }
                        else
                        {
                            jogo[0, 0] = "x";
                            rodada++;
                        }
                        break;
                    case 8:
                        if (jogo[0, 1] == "o" || jogo[0, 1] == "x")
                        {
                            Console.WriteLine("Jogada já feita! refaça sua jogada.");
                        }
                        else
                        {
                            jogo[0, 1] = "x";
                            rodada++;
                        }
                        break;
                    case 9:
                        if (jogo[0, 2] == "o" || jogo[0, 2] == "x")
                        {
                            Console.WriteLine("Jogada já feita! refaça sua jogada.");
                        }
                        else
                        {
                            jogo[0, 2] = "x";
                            rodada++;
                        }
                        break;
                }
            }
            else
            {
                Console.WriteLine("Jogada jogador 2: ");
                jogada = int.Parse(Console.ReadLine());
                switch (jogada)
                {
                    case 1:
                        if (jogo[2, 0] == "x" || jogo[2, 0] == "o")
                        {
                            Console.WriteLine("Jogada já feita! refaça sua jogada.");
                        }
                        else
                        {
                            jogo[2, 0] = "o";
                            rodada++;
                        }
                        break;
                    case 2:
                        if (jogo[2, 1] == "x" || jogo[2, 1] == "o")
                        {
                            Console.WriteLine("Jogada já feita! refaça sua jogada.");
                        }
                        else
                        {
                            jogo[2, 1] = "o";
                            rodada++;
                        }
                        break;
                    case 3:
                        if (jogo[2, 2] == "x" || jogo[2, 2] == "o")
                        {
                            Console.WriteLine("Jogada já feita! refaça sua jogada.");
                        }
                        else
                        {
                            jogo[2, 2] = "o";
                            rodada++;
                        }
                        break;
                    case 4:
                        if (jogo[1, 0] == "x" || jogo[1, 0] == "o")
                        {
                            Console.WriteLine("Jogada já feita! refaça sua jogada.");
                        }
                        else
                        {
                            jogo[1, 0] = "o";
                            rodada++;
                        }
                        break;
                    case 5:
                        if (jogo[1, 1] == "x" || jogo[1, 1] == "o")
                        {
                            Console.WriteLine("Jogada já feita! refaça sua jogada.");
                        }
                        else
                        {
                            jogo[1, 1] = "o";
                            rodada++;
                        }
                        break;
                    case 6:
                        if (jogo[1, 2] == "x" || jogo[1, 2] == "o")
                        {
                            Console.WriteLine("Jogada já feita! refaça sua jogada.");
                        }
                        else
                        {
                            jogo[1, 2] = "o";
                            rodada++;
                        }
                        break;
                    case 7:
                        if (jogo[0, 0] == "x" || jogo[0, 0] == "o")
                        {
                            Console.WriteLine("Jogada já feita! refaça sua jogada.");
                        }
                        else
                        {
                            jogo[0, 0] = "o";
                            rodada++;
                        }
                        break;
                    case 8:
                        if (jogo[0, 1] == "x" || jogo[0, 1] == "o")
                        {
                            Console.WriteLine("Jogada já feita! refaça sua jogada.");
                        }
                        else
                        {
                            jogo[0, 1] = "o";
                            rodada++;
                        }
                        break;
                    case 9:
                        if (jogo[0, 2] == "x" || jogo[0, 2] == "o")
                        {
                            Console.WriteLine("Jogada já feita! refaça sua jogada.");
                        }
                        else
                        {
                            jogo[0, 2] = "o";
                            rodada++;
                        }
                        break;
                }
            }


        }
        public static void ChecarVencedores()
        {
            if ((jogo[0, 0] == "x") && (jogo[0, 1] == "x") && (jogo[0, 2] == "x"))
            {
                Console.WriteLine("Jogador 1 venceu!! :)");
                vencedor = 1;
            }
            if ((jogo[1, 0] == "x") && (jogo[1, 1] == "x") && (jogo[1, 2] == "x"))
            {
                Console.WriteLine("Jogador 1 venceu!! :)");
                vencedor = 1;
            }
            if ((jogo[2, 0] == "x") && (jogo[2, 1] == "x") && (jogo[2, 2] == "x"))
            {
                Console.WriteLine("Jogador 1 venceu!! :)");
                vencedor = 1;
            }
            if ((jogo[2, 0] == "x") && (jogo[1, 1] == "x") && (jogo[0, 2] == "x"))
            {
                Console.WriteLine("Jogador 1 venceu!! :)");
                vencedor = 1;
            }
            if ((jogo[0, 2] == "x") && (jogo[1, 1] == "x") && (jogo[0, 0] == "x"))
            {
                Console.WriteLine("Jogador 1 venceu!! :)");
                vencedor = 1;
            }
            if ((jogo[0, 0] == "") && (jogo[0, 1] == "o") && (jogo[0, 2] == "o"))
            {
                Console.WriteLine("Jogador 2 venceu!! :)");
                vencedor = 1;
            }
            if ((jogo[1, 0] == "o") && (jogo[1, 1] == "o") && (jogo[1, 2] == "o"))
            {
                Console.WriteLine("Jogador 2 venceu!! :)");
                vencedor = 1;
            }
            if ((jogo[2, 0] == "o") && (jogo[2, 1] == "o") && (jogo[2, 2] == "o"))
            {
                Console.WriteLine("Jogador 2 venceu!! :)");
                vencedor = 1;
            }
            if ((jogo[2, 0] == "o") && (jogo[1, 1] == "o") && (jogo[0, 2] == "o"))
            {
                Console.WriteLine("Jogador 2 venceu!! :)");
                vencedor = 1;
            }
            if ((jogo[0, 2] == "o") && (jogo[1, 1] == "o") && (jogo[0, 0] == "o"))
            {
                Console.WriteLine("Jogador 2 venceu!! :)");
                vencedor = 1;
            }
        }
        static void Main(string[] args)
        {
            Console.WriteLine("                         !!! Jogue pelo teclado NumPad !!!");
            Console.WriteLine("                                 Jogador 1 - X");
            Console.WriteLine("                                 Jogador 2 - O");
            Console.WriteLine(" ");
            LimpaTabuleiro();
            for (int i = 0; i < maxJogadas; i++)
            {
                MostrarTabuleiro();
                Jogo();
                ChecarVencedores();
                if (vencedor == 1)
                {
                    break;
                }
            }
            if (vencedor == 0)
            {
                Console.WriteLine("Deu velha! :(");
            }
            Console.ReadKey();
        }
    }
}