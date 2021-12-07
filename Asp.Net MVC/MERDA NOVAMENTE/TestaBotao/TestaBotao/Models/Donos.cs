using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Web;

namespace TestaBotao.Models
{
	public class Donos
	{
		[Key]

		public int IdDono { get; set; }
		public string Nome_Dono { get; set; }
		public int Telefone { get; set; }

	}
}