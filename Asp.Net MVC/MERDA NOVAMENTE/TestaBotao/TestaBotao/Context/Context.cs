using TestaBotao.Models;
using System;
using System.Collections.Generic;
using System.Data.Entity;
using System.Linq;
using System.Web;

namespace TestaBotao.Context
{
    public class Context : DbContext
    {
        public DbSet<Donos> Donos1 { get; set; }
        public DbSet<Caes> Caes1 { get; set; }
        public DbSet<Racas> Racas1 { get; set; }
       
    }
}