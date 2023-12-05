package Controller;

import Model.Carro;
import Model.InfoCarros;
import Model.InfoOrdemServico;
import Model.OrdemServico;
import View.EntradaSaida;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Controladora {

    InfoCarros infocarros = new InfoCarros();
    InfoOrdemServico infoservico = new InfoOrdemServico();

    int opcaoSelecionada;
    int index;
    public void exibeMenu(){

                do {
                    if(infocarros.getCarrosFabricados().isEmpty()){
                        opcaoSelecionada = EntradaSaida.mostraMenuZero();
                        if(opcaoSelecionada == 1){
                            EntradaSaida.exibeMensagemDespedida();
                            System.exit(0);
                        }
                    }
                    else{
                        opcaoSelecionada = EntradaSaida.mostraMenu();
                    }

                    switch (opcaoSelecionada){
                        case 0: // REGISTRAR VEICULO
                            Carro carro = new Carro();
                            carro.setModelo(EntradaSaida.inputModeloCarro());
                            carro.setAno(EntradaSaida.inputAnoVeiculo());
                            carro.setCor(EntradaSaida.inputCorVeiculo());
                            carro.setPlaca(EntradaSaida.inputPlacaVeiculo());
                            EntradaSaida.mostraMensagemSucessoCadastroVeiculo();
                            infocarros.setCarrosFabricados(carro);
                            break;

                        case 1: // MOSTRA VEICULOS REGISTRADOS
                            if(infocarros.getCarrosFabricados().isEmpty()){
                                EntradaSaida.mostraMensagemErroSemCarrosRegistrados();
                            }
                            index = EntradaSaida.indexSelecionado(infocarros.getCarrosFabricados());
                            if(index != infocarros.getCarrosFabricados().size()){
                                EntradaSaida.mostraCarrosRegistrados(infocarros.getCarrosFabricados(), index);
                            }
                            break;

                        case 2: // REGISTRA ORDEM DE SERVIÇO
                            if(infocarros.getCarrosFabricados().isEmpty()){
                                EntradaSaida.mostraMensagemErroSemCarrosRegistrados();
                            }else{
                                index = EntradaSaida.indexSelecionado(infocarros.getCarrosFabricados());
                                OrdemServico ordemservico = new OrdemServico();

                                ordemservico.setCodigoOrdemServico(EntradaSaida.inputCodigoOrdemServico());
                                ordemservico.setDescricaoDefeito(EntradaSaida.inputDescricaoDefeito());
                                ordemservico.setDataEntrada(" - " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
                                ordemservico.setFuncionarioResponsavel(EntradaSaida.inputFuncionarioResponsavel());
                                ordemservico.setValorOrcamento(EntradaSaida.inputValorDoOrcamento());
                                EntradaSaida.mostraMensagemSucessoCadastroOrdemServico();
                                infoservico.setOrdemDeServicos(ordemservico);
                            }
                            break;

                        case 3: // MOSTRA ORDENS DE SERVIÇO REGISTRADAS
                            if (infoservico.getOrdemDeServicos().isEmpty()){
                                EntradaSaida.mostraMensagemErroSemOrdemServicoRegistrados();
                            }
                            else{
                                index = EntradaSaida.indexSelecionado(infocarros.getCarrosFabricados());
                                if(index != infoservico.getOrdemDeServicos().size()){
                                    EntradaSaida.mostraOrdensDeServicoRegistradas(infoservico.getOrdemDeServicos(),infocarros.getCarrosFabricados(), index);
                                }
                            }

                            break;

                        case 4: // SAIR
                            EntradaSaida.exibeMensagemDespedida();
                            System.exit(0);
                            break;
                    }
                }while (true);
            }
}
