using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Web;

namespace TestaBotao.Models
{
	public class Caes
	{
		[Key]

		public int IdCao { get; set; }
		[DisplayName("Dono")]
		public int IdDono { get; set; }
		[DisplayName("Nome do Cão")]
		public string Nome_Cao { get; set; }
		[DisplayName("Nome do Dono")]
		public string Nome_Dono { get; set; }
		[DisplayName("Nome da raça")]
		public string Raca { get; set; }
		[DisplayName("Nome da raça")]
		public int IdRaca { get; set; }

	}   


}