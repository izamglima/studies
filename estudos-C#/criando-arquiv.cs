namespace exemplo_diretorio
{
	class Program
	{
		static void Main(string[] args)
		{
			string nome;
			string diretorio = "C:\\";
			
			try
			{
				Console.Write("Digite um nome: ");
				nome = Console.ReadLine();
				if (!Directory.Exists(diretorio + nome))
				{
					Directory.CreateDirectory(diretorio + nome);
					nome = diretorio + nome + "\\";
					Console.Write("Nome do arquivo: ");
					string arquivo = Console.ReadLine();
					if (!File.Exists(@nome + arquivo))
					{
						File.Create(@nome + arquivo);
						Console.WriteLine("Criado com Sucesso!");
					}
				}
				else
				{
					Console.WriteLine("Já existe o diretório: {0}", nome);
				}
			}
			catch (Exception ex)
			{
				Console.WriteLine("Erro: {0}", ex.Message);
			}
			
			Console.ReadKey();
		}
	}
}