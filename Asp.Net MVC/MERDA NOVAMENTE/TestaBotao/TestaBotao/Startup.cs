using Microsoft.Owin;
using Owin;

[assembly: OwinStartupAttribute(typeof(TestaBotao.Startup))]
namespace TestaBotao
{
    public partial class Startup
    {
        public void Configuration(IAppBuilder app)
        {
            ConfigureAuth(app);
        }
    }
}
