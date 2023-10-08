package classes;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String menu ="######### MENU ########"
					+"\n"
					+"\n1- Cadastrar cliente"
					+"\n2- Listar Clientes"
					+"\n3- Cadastrar Carro"
					+"\n4- Listar Carros"
					+"\n5- Reservar carro"
					+"\n6- Listar alugueis"
					+"\n0- SAIR"
					+ "\n\nDigite a opção desejada:";
		int opcao;
		
		ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
		ArrayList<Carro> listaCarros = new ArrayList<Carro>();
		ArrayList<Aluguel> listaAlugueis = new ArrayList<Aluguel>();
		do {
		
			opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
					
			switch(opcao) {
				case 1:// CADSTRAR CLIENTE
					Cliente cliente = new Cliente();
					cliente.setNome(JOptionPane.showInputDialog("Digite o nome do cliente:"));
					cliente.setCpf(JOptionPane.showInputDialog("Digite o CPF do cliente:"));
					cliente.setTelefone(JOptionPane.showInputDialog("Digite o TELEFONE do cliente:"));
					listaClientes.add(cliente);
				break;
				case 2:// LISTAR CLIENTES
					JOptionPane.showMessageDialog(null, listaClientes);
					
				break;
				case 3:
					Carro carro = new Carro();
					carro.setAno(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do carro:")));
					carro.setModelo(JOptionPane.showInputDialog("Digite o modelo do carro:"));
					carro.setPlaca(JOptionPane.showInputDialog("Digite a placa do carro:"));
					listaCarros.add(carro);
					
				break;
				case 4:
					JOptionPane.showMessageDialog(null, listaCarros);
				break;
				case 5:// Reservar Carro
					Aluguel aluguel = new Aluguel();
					aluguel.setDataInicio(JOptionPane.showInputDialog("Digite a data de início:"));
					aluguel.setDataTermino(JOptionPane.showInputDialog("Digite a data de término:"));
					aluguel.setValor(Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do aluguel:")));
					String placa = JOptionPane.showInputDialog(listaCarros+"\n Digite a placa do carro desejado:");
					
					Carro carroDoAluguel = null;
					for (Carro carros : listaCarros) {
						if (carros.getPlaca().equals(placa)) {
							carroDoAluguel = carros;
						}
					}
					//Pega o objeto CARRO da lista dos carros cadastrados
					aluguel.setCarro(carroDoAluguel);
		

					
					String cpf = JOptionPane.showInputDialog(listaClientes+"\n Digite o cpf do cliente desejado:");
					Cliente clienteAluguel = null;
					for (Cliente clientes : listaClientes) {
						if (clientes.getCpf().equals(cpf)) {
							clienteAluguel = clientes;
						}
					}
					//Pega o objeto CARRO da lista dos carros cadastrados
					aluguel.setCliente(clienteAluguel);
					
					
					// Adicionar o aluguel na lista
					listaAlugueis.add(aluguel);
					
				break;
				case 6:
								
					JOptionPane.showMessageDialog(null, listaAlugueis);
				break;
			}
		
		}while(opcao != 0);
		
		
		
	}

}
