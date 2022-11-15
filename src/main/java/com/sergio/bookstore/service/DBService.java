package com.sergio.bookstore.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sergio.bookstore.domain.Categoria;
import com.sergio.bookstore.domain.Livro;
import com.sergio.bookstore.repositories.CategoriaRepository;
import com.sergio.bookstore.repositories.LivroRepository;

@Service
public class DBService {

	@Autowired
	private CategoriaRepository categoriaRepository;

	@Autowired
	private LivroRepository livroRepository;

	public void instanciaBaseDeDados() {

		// instanciou o objeto categoria
		Categoria cat1 = new Categoria(null, "Fantasia", "Conto de Fadas");
	
		// salvando uma categoria
		 this.categoriaRepository.saveAll(Arrays.asList(cat1));
			
		
		// instanciou o objeto Livro e relacionou ao final a categoria "Cat1"
		Livro livro = new Livro(null,"","Conto de Fadas","Stephen King","usuario1"
				+ "Descrição do livro\n"
				+ "Aos dezessete anos de idade, Charlie Reade parece ser um garoto comum: pratica esportes, é um filho atencioso e aluno de desempenho razoável. Suas lembranças, entretanto, não são feitas apenas de momentos felizes. Após perder a mãe em um grave acidente quando tinha apenas dez anos, Charlie precisou aprender a cuidar de si e do pai, que, enlutado com a perda da esposa, buscou refúgio na bebida.\n"
				+ "Certo dia, ao pedalar pela rua de casa, Charlie atende um pedido de socorro vindo do quintal de um dos vizinhos: Howard Bowditch. O homem recluso e rabugento, que amedrontava as crianças do bairro, cai de uma escada e se machuca gravemente. O chamado por ajuda veio de Radar, a fiel pastor alemão , tão idosa quanto seu dono.\n"
				+ "Enquanto Bowditch se recupera, Charlie passa a ajudar o vizinho com tarefas domésticas e com o cuidado de Radar, e assim o rapaz faz duas grandes amizades. Quando Howard morre, Charlie se depara com uma fita cassete que revela um segredo inimaginável: um portal para outro mundo.\n"
				+ "\n"
				+ "“Cidades devastadas, disputas políticas e clima de incerteza fazem desta uma grandiosa, e naturalmente estranha, obra de entretenimento.” ― Kirkus\n"
				+ "\n"
				+ "“Muitos escritores narram os fatos como eles são, mas poucos conseguem, com tanto empenho e intensidade, contá-los como eles não são. King usa o que há de estranho e dá corpo a isso. E, ao mesmo tempo, seus romances conservam muita leveza e jovialidade. Eles nos mostram coisas horríveis, mas também refletem a alegria de King ― com o prazer e a satisfação que ele tem em imaginar.” ― The New Yorker\n"
				+ "\n"
				+ "Charlie começa a fazer trabalhos para o Sr. Bowditch e perde seu coração para Radar. Então, quando Bowditch morre, ele deixa uma fita cassete para Charlie contando uma história que ninguém acreditaria. O que Bowditch sabe, e manteve em segredo durante toda a sua vida, é que dentro do galpão há um portal para outro mundo.\n"
				+ "\n"
				+ "A narrativa de King em Fairy Tale dispara. Este é um conto magnífico e aterrorizante sobre outro mundo que não o nosso, no qual o bem é colocado contra o mal avassalador, e um menino heróico – e seu cachorro – deve liderar a batalha.",cat1);
		
		

		// aqui o categoria instanciou um livro.
		cat1.getLivro().addAll(Arrays.asList(livro));
		

		

		this.livroRepository.saveAll(Arrays.asList(livro));
		

	}
}
