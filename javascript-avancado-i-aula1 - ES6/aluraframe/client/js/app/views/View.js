class View {

    constructor (elemento) {
        this._elemento = elemento;
    }

    // simulando um metodo abstrato que obrigaria as classes filhas a implementar este metodo
    _template() {
        throw new Error('O método template deve ser implementado');
    }

    update(model) {
        this._elemento.innerHTML = this._template(model);
    }
}