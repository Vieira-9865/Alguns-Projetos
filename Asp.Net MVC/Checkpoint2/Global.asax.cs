using System;
using System.Collections.Generic;
using System.Data.Entity;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using System.Web.Optimization;
using System.Web.Routing;

namespace Checkpoint2
{
    public class MvcApplication : System.Web.HttpApplication
    {
        protected void Application_Start()
        {
            AreaRegistration.RegisterAllAreas();
            FilterConfig.RegisterGlobalFilters(GlobalFilters.Filters);
            RouteConfig.RegisterRoutes(RouteTable.Routes);
            BundleConfig.RegisterBundles(BundleTable.Bundles);
            //Essa linha abaixo serve para atualizar e apagando os dados da tabela para fazer alçgumas alterações que vc faça
            Database.SetInitializer<Context.Context>(new DropCreateDatabaseIfModelChanges<Context.Context>());

        }
    }
}
