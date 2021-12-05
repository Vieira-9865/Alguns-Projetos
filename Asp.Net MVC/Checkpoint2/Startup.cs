using Microsoft.Owin;
using Owin;

[assembly: OwinStartupAttribute(typeof(Checkpoint2.Startup))]
namespace Checkpoint2
{
    public partial class Startup
    {
        public void Configuration(IAppBuilder app)
        {
            ConfigureAuth(app);
        }
    }
}
