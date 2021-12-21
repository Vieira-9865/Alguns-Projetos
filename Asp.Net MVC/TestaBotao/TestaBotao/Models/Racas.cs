using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Web;

namespace TestaBotao.Models
{
	public class Racas
	{
		[Key]
		public int IdRaca { get; set; }
		public string Raca { get; set; }

	}
}
