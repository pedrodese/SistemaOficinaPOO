package Model;

import java.util.ArrayList;

public class InfoOrdemServico {
    private final ArrayList<OrdemServico> ordemDeServicos = new ArrayList<>();

        public ArrayList<OrdemServico> getOrdemDeServicos(){
            return ordemDeServicos;
        }

        public void setOrdemDeServicos(OrdemServico ordemServico){
            this.ordemDeServicos.add(ordemServico);
        }


}
