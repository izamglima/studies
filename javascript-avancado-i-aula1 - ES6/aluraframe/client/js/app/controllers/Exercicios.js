class Aluno {

    constructor(matricula, nome) {
        this.matricula = matricula;
        this.nome = nome;
    }
}

class Prova {

    constructor(aluno, nota) {
        this.aluno = aluno;
        this.nota = nota;
    }
}


let avaliacoes = [
    new Prova(new Aluno(1, 'Luana'), 8),
    new Prova(new Aluno(2, 'Cássio'), 6),
    new Prova(new Aluno(3, 'Barney'), 9),
    new Prova(new Aluno(4, 'Bira'), 5)
];

// let aprovados = avaliacoes
// .filter(function(prova) { return prova.nota >= 7; })
// .map(function(prova) { return prova.aluno.nome;});

let aprovados = avaliacoes
.filter(prova => prova.nota >= 7)
.map(prova => prova.aluno.nome);

console.log(aprovados);


let dataString = '17-05-2016';
let data = new Date(dataString.split('-').reverse().join('/'));
console.log(data);



let numeros = [3,2,11,20,8,7];
// se o resultado for 0, é porque o item é divisível por dois, ou seja, é par.
let novosNumeros = numeros.map(item => item % 2 ? item * 2 : item);
console.log(novosNumeros);
