class MensagemView extends View {

    constructor(elemento) {

        super(elemento);
    }

    _template(model) {
        // ternário checando a string
        // se é diferente de espaco em branco, 0 ou null
        // string sem conteudo é avaliada como false
        return model.texto ? `<p class="alert alert-info">${model.texto}</p>` : `<p></p>`;
    }

}