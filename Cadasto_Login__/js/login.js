let btn = document.querySelector('.fa-eye')



btn.addEventListener('click', ()=>{
    let inputSenha = document.querySelector('#senha')

    if (inputSenha.getAttribute('type') == 'password') {
        inputSenha.setAttribute('type', 'text')
    } else{
        inputSenha.setAttribute('type', 'password')
    }
})


document.addEventListener("keypress", function(e){
    if (e.key === "Enter") {
        const btn = document.querySelector("#botao")

        btn.click(entrar);
    }


})



function entrar(){

let usuario = document.querySelector('#usuario')
let labelusuario = document.querySelector('#labelUsuario')


let senha = document.querySelector('#senha')
let labelSenha = document.querySelector('#labelSenha')


let msgError = document.querySelector('#msgError')
let listaUser = []

let userValid={
    nome: '',
    user: '', 
    senha: ''
}
    listaUser = JSON.parse(localStorage.getItem('listaUser'))

    listaUser.forEach((element) => {
        if (usuario.value == element.userCadastro && senha.value == element.senhaCadastro) {
            userValid = {
                nome: element.nomeCadastro,
                user: element.userCadastro,
                senha: element.senhaCadastro

            }
        }
    });

    // console.log("Nome valido "+userValid.nome)
    // console.log("Usuario valido "+userValid.userCadastro)
    // console.log('valor usuario '+ usuario.value)
    // console.log("senha valida "+userValid.senhaCadastro)
    // console.log('valor senha '+ senha.value)

    let mathRandom = Math.random().toString(16).substring(2)

    let token = mathRandom + mathRandom


    if (usuario.value == userValid.user && senha.value == userValid.senha && usuario.value !='') {
        window.location.href = './pos_login.html'

        localStorage.setItem('token', token)

        localStorage.setItem('userLogado', JSON.stringify(userValid))
        
    } else{
        labelusuario.setAttribute('style' , 'color: red')
        usuario.setAttribute('style' , 'border-color: red')
        labelSenha.setAttribute('style' , 'color: red')
        senha.setAttribute('style' , 'border-color: red')
        msgError.setAttribute('style', 'display: block')
        msgError.innerHTML = '<strong>Usuário ou senha incorretos</strong>'
        usuario.focus()

        console.log(token)


    }
    
}