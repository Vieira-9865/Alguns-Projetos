using Checkpoint2.Models;
using System;
using System.Collections.Generic;
using System.Data.Entity;
using System.Linq;
using System.Web;

namespace Checkpoint2.Context
{
    public class Context : DbContext
    {
        public DbSet<Donos> Dono1 { get; set; }
        public DbSet<Caes> Caes1 { get; set; }
        public DbSet<Racas> Racas1 { get; set; }
    }
}
/*Tabela Donos
Id Dono autoincremento
Nome Dono
Telefone
*/