Projeto usando node express.

Foco de estudo:

- ES6 MVC
- Uso de classes
- Programação defensiva (retorna a cópia de um objeto para o get/set não conseguir alterar o valor origina ou seja, retorna um novo objeto para n ser alterado de fora)
- GET na classe permite acessar o valor como se fosse uma propriedade e nao um metodo. Ex negociacao.volume
- Constructor  só sera chamado quando houver o operador new
- ES6 permite instanciar um parametro default caso nao tenha sido passado nenhum valor no constructor
- Template String: `Essa é uma string interpolada ${data.getDate()}`
- Spread Operator:  permite que um objeto iterável, como um array ou string, seja expandida, quando passa para uma funcao, com o spread operator, cada item do array é passado como parametro. Exemplo:
`
    anyFunction(itemArray1, itemArray2, itemArray3)
    let arr1 = [0, 1, 2];
    let arr2 = [3, 4, 5];
    arr1.push(...arr2);
`
- Arrow function, quando tem apenas uma instrucao no arrow function pode-se omitir o {} do bloco, nem do return ela ja vai retornar.
`
// sem arrow function
let aprovados = avaliacoes
    .filter(function(prova) { return prova.nota >= 7; })
    .map(function(prova) { return prova.aluno.nome;});

// com arrow function
let aprovados = avaliacoes
    .filter(prova => prova.nota >= 7)
    .map(prova => prova.aluno.nome);
`
- Método Static nas classes
`
    sem o método static na classe
    let date = new DateHelper().textoParaData(this._inputData.value);
        
    com método static
    let date = DateHelper.textoParaData(this._inputData.value);
`
- Usando um "jQuery" simplificado para buscar seletores no dom:
`
// adicionando no construtor, para agir como se fosse um cache e percorrer apenas uma vez o dom
// precisa dar o bind porque se nao o this perde o document
let $ = document.querySelector.bind(document);
this._inputData = $('#data'); // convenção para dizer que a propriedade é "privada"
`
