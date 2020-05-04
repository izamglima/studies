class NegociacoesView extends View {

    //poderia ser omitido este constructor
    constructor(elemento) {
        super(elemento);
    }

    _template(model) {

        return `
        <table class="table table-hover table-bordered">
            <thead>
                <tr>
                    <th>DATA</th>
                    <th>QUANTIDADE</th>
                    <th>VALOR</th>
                    <th>VOLUME</th>
                </tr>
            </thead>
            <tbody>
            ${model.negociacoes.map(n =>
                `
                    <tr>
                        <td>${DateHelper.dataParaTexto(n.data)}</td>
                        <td>${n.quantidade}</td>
                        <td>${n.valor}</td>
                        <td>${n.volume}</td>
                    </tr>
                `
                ).join('')}
            </tbody>
            <tfoot>
                <td colspan="3"></td>
                <td>
                    ${model.negociacoes.reduce((total, n) => total + n.volume, 0.0)}
                </td>
            </tfoot>
        </table>
        `;
    }
}

/*
Procedural com  self invoked function
${
    (function() {
        let total = 0;
        model.negociacoes.forEach(n => total+= n.volume);
        return total;
    })()
}

Functional sem arrow function valor inicial 0.0
${model.negociacoes.reduce(function(total, n) {
    return total + n.volume;
}, 0.0)}

numeros.reduce(function(total,num) {
    return total * num;
}, 1);

numeros.reduce((total,num) => total * num, 1)

// retorna um novo array com trs
let funcionariosEmHtml = funcionarios.map(f => 
    `<tr>
        <td>${f.nome}</td>
        <td>${f.endereco}</td>
        <td>${f.salario}</td>
    </tr>
    `);

// transforma o array numa stringona
let htmlConcatenado = funcionariosEmHtml.join('');

let dobro = numeros.map(function(num) {
    return num * 2;
});

let dobro = numeros.map(num => num * 2);

let metade = numeros.map(function(num) {
    return num/2;
});

let metade = numeros.map(num => num /2);

let raiz = numeros.map(function(num) {
    return Math.sqrt(num);
});

let raiz = numeros.map((num) => {
    return Math.sqrt(num);
});
ou

let raiz = numeros.map(num => Math.sqrt(num))

*/

