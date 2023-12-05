package View;

import Model.Carro;
import Model.OrdemServico;

import javax.swing.*;
import java.util.ArrayList;


public class EntradaSaida {

        public static int mostraMenuZero() {
            String[] opcoes = {"Registrar um novo veiculo", "Sair"};

            JComboBox menu = new JComboBox(opcoes);
            JOptionPane.showConfirmDialog(null, menu, "Selecione a opção desejada", JOptionPane.DEFAULT_OPTION);
            return menu.getSelectedIndex();
        }

        public static int mostraMenu() {
            String[] opcoes = {"Registrar um novo veiculo", "Mostrar veiculos registrados", "Criar Ordem de Serviço"
                    , "Mostrar Ordens de serviço registradas","Sair"};

            JComboBox menu = new JComboBox(opcoes);
            JOptionPane.showConfirmDialog(null, menu, "Menu Principal", JOptionPane.DEFAULT_OPTION);
            return menu.getSelectedIndex();
        }


        public static void mostraMensagemErroSemCarrosRegistrados(){
            JOptionPane.showMessageDialog(null, "Você não possui carros registrados, por favor registre o carro necessário",
                    "Alerta", JOptionPane.ERROR_MESSAGE);
        }

        public static String inputModeloCarro(){
            return  JOptionPane.showInputDialog(null,"Informe o modelo do veiculo","Registro de Veiculo",JOptionPane.PLAIN_MESSAGE);
        }

        public static String inputPlacaVeiculo() {
             return JOptionPane.showInputDialog(null, "Informe a placa do veiculo ", "Registro de Veiculo", JOptionPane.PLAIN_MESSAGE);
        }

        public static int inputAnoVeiculo() {
            return Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o ano de fabricação do veiculo","Registro de Veiculo",JOptionPane.PLAIN_MESSAGE));
        }

        public static String inputCorVeiculo() {
            return JOptionPane.showInputDialog(null,"Informe a cor do veiculo","Registro de Veiculo",JOptionPane.PLAIN_MESSAGE);
        }

        public static void mostraCarrosRegistrados(ArrayList<Carro> carros, int index) {
            String desc = "Modelo " + carros.get(index).getModelo() + "\n" +
                    "Ano: " + carros.get(index).getAno() + "\n" +
                    "Cor: " + carros.get(index).getCor()+ "\n"+
                    "Placa: " + carros.get(index).getPlaca();

            JOptionPane.showMessageDialog(null, desc, "Informações dos carros registrados",
                    JOptionPane.PLAIN_MESSAGE);
        }


    public static void mostraMensagemErroSemOrdemServicoRegistrados(){
        JOptionPane.showMessageDialog(null, "Você não possui ordens de serviço registrados, por favor registre a ordem de serviço necessária",
                "Alerta", JOptionPane.ERROR_MESSAGE);
    }

    public static String inputDescricaoDefeito(){
        return  JOptionPane.showInputDialog(null,"Informe o defeito do veiculo: ","Registro de Ordem de Serviço",JOptionPane.PLAIN_MESSAGE);
    }

    public static String inputFuncionarioResponsavel() {
        return JOptionPane.showInputDialog(null, "Informe o funcionario responsavel pela manutenção: ", "Registro de Ordem de Serviço", JOptionPane.PLAIN_MESSAGE);
    }

    public static int inputValorDoOrcamento() {
        return Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o valor do orçamento: ","Registro de Ordem de Serviço",JOptionPane.PLAIN_MESSAGE));
    }

    public static int inputCodigoOrdemServico(){
            return Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o Código da Ordem de Serviço: "));
    }

    public static int indexSelecionado(ArrayList<Carro> carros) {
        String[] placas = new String[carros.size()+1];

        for (int x = 0; x < carros.size()+1; x++) {
            try{
                placas[x] = "Placa do Veiculo: " + carros.get(x).getPlaca();
            }
            catch (IndexOutOfBoundsException e){
                placas[x] = "Voltar";
            }

        }

        JComboBox menu = new JComboBox<>(placas);

        JOptionPane.showMessageDialog(null, menu, "Selecione o veiculo desejado pela placa!", JOptionPane.PLAIN_MESSAGE);

        return menu.getSelectedIndex();
    }

    public static void mostraOrdensDeServicoRegistradas(ArrayList<OrdemServico> ordens, ArrayList<Carro> carros, int index) {
        String desc =
                "Código da Ordem de Serviço: " + ordens.get(index).getCodigoOrdemServico() + "\n" +
                "Descrição do Defeito: " + ordens.get(index).getDescricaoDefeito() + "\n" +
                "Valor do Orçamento:  " + ordens.get(index).getValorOrcamento() + "\n" +
                "Funcionário Responsável: " + ordens.get(index).getFuncionarioResponsavel() + "\n" +
                "Data de Entrada: " + ordens.get(index).getDataEntrada() + "\n" +
                "Modelo do Veiculo:  " + carros.get(index).getModelo() + "\n" +
                "Ano: " + carros.get(index).getAno() + "\n" +
                "Placa: " + carros.get(index).getPlaca()+ "\n" +
                "Cor: " + carros.get(index).getCor() + "\n";

        JOptionPane.showMessageDialog(null, desc, "Informações das Ordens de Serviço registradas",
                JOptionPane.PLAIN_MESSAGE);
    }
    public static void mostraMensagemSucessoCadastroOrdemServico(){
        JOptionPane.showMessageDialog(null,"A ordem de serviço foi cadastrada com sucesso!","Registrar Ordem de Serviço", JOptionPane.PLAIN_MESSAGE);
    }

    public static void mostraMensagemSucessoCadastroVeiculo(){
            JOptionPane.showMessageDialog(null,"O veiculo foi cadastrado com sucesso!","Registro de Veiculo",JOptionPane.PLAIN_MESSAGE);
    }

    public static void exibeMensagemDespedida(){
        JOptionPane.showMessageDialog(null,"Obrigado por utilizar o nosso sistema! Volte sempre :)");
    }
}


