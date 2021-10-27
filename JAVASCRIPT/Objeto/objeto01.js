let amigo = {nome: 'José', 
sexo: 'M',
peso: 85.4,
engordar(p=0){
    console.log('Engordou')
    this.peso += p
},
lgbt(ss){
    this.sexo = ss
}}

amigo.lgbt("sou negão")
amigo.engordar(10)
console.log(`${amigo.nome} pesa ${amigo.peso}Kg, com sexo ${amigo.sexo}`)