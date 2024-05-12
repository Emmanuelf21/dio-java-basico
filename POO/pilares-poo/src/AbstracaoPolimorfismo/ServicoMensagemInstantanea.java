package AbstracaoPolimorfismo;

public abstract class ServicoMensagemInstantanea {
    //abstract força as classes filhas a terem estes métodos
    //com isso temos polimorfismo desses métodos
    //cada classe terá o mesmo método com seu jeito de executar
    public abstract  void enviarMensagem();
    public abstract void receberMensagem();
}
