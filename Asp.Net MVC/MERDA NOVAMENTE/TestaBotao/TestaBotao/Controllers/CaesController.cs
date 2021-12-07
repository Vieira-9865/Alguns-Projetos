using System;
using System.Collections.Generic;
using System.Data;
using System.Data.Entity;
using System.Linq;
using System.Net;
using System.Web;
using System.Web.Mvc;
using TestaBotao.Context;
using TestaBotao.Models;

namespace Checkpoint2.Models
{
    public class CaesController : Controller
    {
        private Context db = new Context();
        //
        private Racas Racasnom = new Racas();
        // GET: Caes
        // ? recebe valor inteiro ou nulo

        public ActionResult Index(int? IdRacaFiltro)
        {
            //Pegando os dados do Context Racas1
            List<Racas> listaRacas = db.Racas1.ToList();
            // A viewbag já está fazendo método para para pegar o IdRaca e mostrar o Nome 
            ViewBag.listaRacas = listaRacas;
            //Se o IdRacaFiltro for diferente de nulo acontece essa condição
            if (IdRacaFiltro != null)
            {
                List<Caes> listinhaRacas = db.Caes1.ToList();
                //Verificação da informação abaixo
                // Fazendo uma busca onde idraca da modelcaes for igual a viewbag.IdRacaFiltro que pega o idraca e mostra o nome da raca
                listinhaRacas = listinhaRacas.Where(r => r.IdRaca == IdRacaFiltro).ToList();
                //Navegar interligando a tabela caes na ,listinhaRacas e fazendo uma consulta 
                foreach (Caes item22 in listinhaRacas)
                {
                    var bb = db.Donos1.Where(h => h.IdDono == item22.IdDono).FirstOrDefault();
                    item22.Nome_Dono = bb.Nome_Dono;
                    var gg = db.Racas1.Where(g => g.IdRaca == item22.IdRaca).FirstOrDefault();
                    item22.Raca = gg.Raca;


                }
                // Pode mais de um returnview se for dentro do if
                return View(listinhaRacas);
            }

            // Peguei os dados da context  Caes1 do banco de dados para a lista 
            List<Caes> listinha = db.Caes1.ToList();
            //Está relacionando os contexts Dono1 e Raca1 onde vai criar essas variaveis que vao pegar o IdDono e IdRaca e igualar á chave estrangeira que seria o IdDono e IdRaca só que na tabela Caes
            foreach (Caes item in listinha)
            {
                var bb = db.Donos1.Where(h => h.IdDono == item.IdDono).FirstOrDefault();
                item.Nome_Dono = bb.Nome_Dono;
                var gg = db.Racas1.Where(g => g.IdRaca == item.IdRaca).FirstOrDefault();
                item.Raca = gg.Raca;

            }
            //Para mostrar listinha que foi configurado acima
            return View(listinha);
        }

        // GET: Caes/Details/5
        public ActionResult Details(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            Caes caes = db.Caes1.Find(id);
            if (caes == null)
            {
                return HttpNotFound();
            }
            return View(caes);
        }

        // GET: Caes/Create
        public ActionResult Create()
        {
            //View bag que pega os dados dos banco de dados para a lista 
            // E adicionando o nome da variavel filtro e filtroRacas que vai ser igual a sua respectiva lista
            List<Donos> listaDonos = db.Donos1.ToList();
            ViewBag.Filtro = listaDonos;
            List<Racas> listaRacas = db.Racas1.ToList();
            ViewBag.FiltroRacas = listaRacas;
            return View();
        }

        // POST: Caes/Create
        // Para se proteger de mais ataques, habilite as propriedades específicas às quais você quer se associar. Para 
        // obter mais detalhes, veja https://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Create([Bind(Include = "IdCao,IdDono,Nome_Cao,IdRaca")] Caes caes)
        {
            if (ModelState.IsValid)
            {
                db.Caes1.Add(caes);
                db.SaveChanges();
                return RedirectToAction("Index");
            }

            return View(caes);
        }

        // GET: Caes/Edit/5
        public ActionResult Edit(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            Caes caes = db.Caes1.Find(id);
            if (caes == null)
            {
                return HttpNotFound();
            }
            return View(caes);
        }

        // POST: Caes/Edit/5
        // Para se proteger de mais ataques, habilite as propriedades específicas às quais você quer se associar. Para 
        // obter mais detalhes, veja https://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Edit([Bind(Include = "IdCao,IdDono,Nome_Cao,IdRaca")] Caes caes)
        {
            if (ModelState.IsValid)
            {
                db.Entry(caes).State = EntityState.Modified;
                db.SaveChanges();
                return RedirectToAction("Index");
            }
            return View(caes);
        }

        // GET: Caes/Delete/5
        public ActionResult Delete(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            Caes caes = db.Caes1.Find(id);
            if (caes == null)
            {
                return HttpNotFound();
            }
            return View(caes);
        }

        // POST: Caes/Delete/5
        [HttpPost, ActionName("Delete")]
        [ValidateAntiForgeryToken]
        public ActionResult DeleteConfirmed(int id)
        {
            Caes caes = db.Caes1.Find(id);
            db.Caes1.Remove(caes);
            db.SaveChanges();
            return RedirectToAction("Index");
        }

        protected override void Dispose(bool disposing)
        {
            if (disposing)
            {
                db.Dispose();
            }
            base.Dispose(disposing);
        }
    }
}
