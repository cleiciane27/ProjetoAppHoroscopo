/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import java.awt.Image;
import java.time.LocalDate;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author CleicianeGomes
 */
public class Signos extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Signos.class.getName());

    /**
     * Creates new form Signos
     */
    
    //Criando a variavel para guardar a MUSICA
    Clip musica;
    
    
    
    public Signos() {
        initComponents();
        RedimencionarImagens();
        PreencherPrevisao();
        PreencherMensagem();
        CorrigirAreasTextos();
    }
    
    //TODA   FUNÇAO   É  CRIADA   ABAIXO  DO  CONSTRUTOR
    
   public void RedimencionarImagens(){
   //capturar as imagens que estao dentro da label 
   ImageIcon aries = (ImageIcon) imgSignoAries.getIcon();
    ImageIcon touro = (ImageIcon) imgSignoTouro.getIcon();
   ImageIcon gemeos = (ImageIcon) imgSignoGemeos.getIcon();
   ImageIcon cancer = (ImageIcon) imgSignoCancer.getIcon();
   ImageIcon  leao= (ImageIcon) imgSignoLeao.getIcon();
   ImageIcon virgem = (ImageIcon) imgSignoVirgem.getIcon();
   ImageIcon libra = (ImageIcon) imgSignoLibra.getIcon();
   ImageIcon escorpiao = (ImageIcon) imgSignoEscorpiao.getIcon();
   ImageIcon sagitario = (ImageIcon) imgSignoSagitario.getIcon();
   ImageIcon capricornio = (ImageIcon) imgSignoCapricornio.getIcon();
   ImageIcon aquario = (ImageIcon) imgSignoAquario.getIcon();
   ImageIcon peixes = (ImageIcon) imgSignoPeixes.getIcon();
   
   //redimensionar o tamanho delas
   Image imgAries = aries.getImage().getScaledInstance(300, 450, Image.SCALE_SMOOTH);
   Image imgTouro = touro.getImage().getScaledInstance(290, 450, Image.SCALE_SMOOTH);
   Image imgGemeos= gemeos.getImage().getScaledInstance(300, 450, Image.SCALE_SMOOTH);
   Image imgCancer = cancer.getImage().getScaledInstance(300, 450, Image.SCALE_SMOOTH);
   Image imgLeao = leao.getImage().getScaledInstance(380, 450, Image.SCALE_SMOOTH);
   Image imgVirgem = virgem.getImage().getScaledInstance(300, 450, Image.SCALE_SMOOTH);
   Image imgLibra = libra.getImage().getScaledInstance(300, 450, Image.SCALE_SMOOTH);
   Image imgEscorpiao = escorpiao.getImage().getScaledInstance(300, 450, Image.SCALE_SMOOTH);
   Image imgSagitario = sagitario.getImage().getScaledInstance(300, 450, Image.SCALE_SMOOTH);
   Image imgCapricornio = capricornio.getImage().getScaledInstance(300, 450, Image.SCALE_SMOOTH);
   Image imgAquario = aquario.getImage().getScaledInstance(300, 450, Image.SCALE_SMOOTH);
   Image imgPeixes = peixes.getImage().getScaledInstance(300, 450, Image.SCALE_SMOOTH);

   //jogar a imagem redimensionada na label
   imgSignoAries.setIcon(new ImageIcon (imgAries));
   imgSignoTouro.setIcon(new ImageIcon (imgTouro));
   imgSignoGemeos.setIcon(new ImageIcon (imgGemeos));
   imgSignoCancer.setIcon(new ImageIcon (imgCancer));
   imgSignoLeao.setIcon(new ImageIcon (imgLeao));
   imgSignoVirgem.setIcon(new ImageIcon (imgVirgem));
   imgSignoLibra.setIcon(new ImageIcon (imgLibra));
   imgSignoEscorpiao.setIcon(new ImageIcon (imgEscorpiao));
   imgSignoSagitario.setIcon(new ImageIcon (imgSagitario));
   imgSignoCapricornio.setIcon(new ImageIcon (imgCapricornio));
   imgSignoAquario.setIcon(new ImageIcon (imgAquario));
   imgSignoPeixes.setIcon(new ImageIcon (imgPeixes));

   }//fim da funçao
   
   public void PreencherPrevisao(){
   //verificar o dia da semana
   //LocalDate - puxa a data do computador
   int diaSemana = LocalDate.now().getDayOfWeek().getValue();
 
   //criar a condicional para preencher o campo reservado
   switch(diaSemana){
    case 1: // SEGUNDA-FEIRA
        txtPrevisaoAries.setText("Comece a semana com coragem e coloque seus planos em prática.");
        txtPrevisaoTouro.setText("Tenha calma e organize suas tarefas antes de tomar decisões.");
        txtPrevisaoGemeos.setText("Uma conversa pode trazer uma nova ideia ou oportunidade.");
        txtPrevisaoCancer.setText("Reserve um tempo para cuidar de você e das pessoas importantes.");
        txtPrevisaoLeao.setText("Sua confiança estará em alta. Aproveite para mostrar seu potencial.");
        txtPrevisaoVirgem.setText("Organização será a chave para ter um dia mais tranquilo.");
        txtPrevisaoLibra.setText("Procure equilíbrio entre suas responsabilidades e seu bem-estar.");
        txtPrevisaoEscorpiao.setText("Sua determinação ajudará você a superar um pequeno desafio.");
        txtPrevisaoSagitario.setText("Uma nova possibilidade pode deixar seu dia mais animado.");
        txtPrevisaoCapricornio.setText("Mantenha o foco e avance pouco a pouco em direção aos seus objetivos.");
        txtPrevisaoAquarios.setText("Uma ideia diferente pode chamar atenção. Confie na sua criatividade.");
        txtPrevisaoPeixes.setText("Escute sua intuição, mas pense com calma antes de decidir.");
        break;
    case 2: // TERÇA-FEIRA
        txtPrevisaoAries.setText("Evite a pressa e pense antes de agir. Paciência será importante hoje.");
        txtPrevisaoTouro.setText("Uma oportunidade de melhorar sua rotina pode surgir inesperadamente.");
        txtPrevisaoGemeos.setText("Seu poder de comunicação estará favorecido. Aproveite para conversar.");
        txtPrevisaoCancer.setText("Uma conversa sincera pode aproximar você de alguém especial.");
        txtPrevisaoLeao.setText("Reconheça suas conquistas e continue trabalhando com confiança.");
        txtPrevisaoVirgem.setText("Concentre-se nos detalhes, mas não cobre perfeição de si mesmo.");
        txtPrevisaoLibra.setText("Uma decisão que estava pendente pode finalmente ficar mais clara.");
        txtPrevisaoEscorpiao.setText("Confie mais nas suas capacidades para resolver situações complicadas.");
        txtPrevisaoSagitario.setText("Experimente algo diferente e permita-se sair um pouco da rotina.");
        txtPrevisaoCapricornio.setText("Seu esforço pode começar a apresentar resultados positivos.");
        txtPrevisaoAquarios.setText("Compartilhar suas ideias pode abrir espaço para novas possibilidades.");
        txtPrevisaoPeixes.setText("Um momento tranquilo pode ajudar você a organizar seus pensamentos.");
        break;
    case 3: // QUARTA-FEIRA
        txtPrevisaoAries.setText("Metade da semana pede foco. Não desista dos seus objetivos.");
        txtPrevisaoTouro.setText("Mantenha os pés no chão e valorize as pequenas conquistas.");
        txtPrevisaoGemeos.setText("Sua curiosidade pode levar você a descobrir algo interessante.");
        txtPrevisaoCancer.setText("Dê atenção aos seus sentimentos e não tenha medo de expressá-los.");
        txtPrevisaoLeao.setText("Uma atitude positiva pode influenciar quem está ao seu redor.");
        txtPrevisaoVirgem.setText("Revise seus planos e faça os ajustes necessários para continuar avançando.");
        txtPrevisaoLibra.setText("Procure ouvir diferentes opiniões antes de escolher um caminho.");
        txtPrevisaoEscorpiao.setText("Você terá força para lidar com uma situação que exige determinação.");
        txtPrevisaoSagitario.setText("Mantenha o otimismo mesmo diante de pequenos obstáculos.");
        txtPrevisaoCapricornio.setText("Continue firme. A disciplina de hoje ajudará nos resultados futuros.");
        txtPrevisaoAquarios.setText("Sua criatividade estará favorecida. Aproveite para pensar em novas soluções.");
        txtPrevisaoPeixes.setText("Não ignore aquilo que está sentindo. Um pouco de descanso pode ajudar.");
        break;
    case 4: // QUINTA-FEIRA
        txtPrevisaoAries.setText("Uma atitude corajosa pode ajudar você a resolver algo que estava pendente.");
        txtPrevisaoTouro.setText("Tenha paciência. Algumas coisas precisam de tempo para acontecer.");
        txtPrevisaoGemeos.setText("Uma notícia ou conversa inesperada pode mudar seus planos.");
        txtPrevisaoCancer.setText("Valorize as relações que trazem segurança e tranquilidade.");
        txtPrevisaoLeao.setText("Você poderá se destacar ao demonstrar suas habilidades.");
        txtPrevisaoVirgem.setText("Uma boa organização pode deixar seu dia mais produtivo.");
        txtPrevisaoLibra.setText("Um acordo ou conversa pode ajudar a resolver uma situação.");
        txtPrevisaoEscorpiao.setText("Deixe para trás aquilo que não contribui mais para seus objetivos.");
        txtPrevisaoSagitario.setText("Um convite ou oportunidade pode despertar sua curiosidade.");
        txtPrevisaoCapricornio.setText("Seu comprometimento será percebido. Continue fazendo sua parte.");
        txtPrevisaoAquarios.setText("Não tenha medo de apresentar uma solução diferente.");
        txtPrevisaoPeixes.setText("Sua sensibilidade pode ajudar você a compreender melhor alguém.");
        break;
    case 5: // SEXTA-FEIRA
        txtPrevisaoAries.setText("Finalize a semana com energia e aproveite para reconhecer seus avanços.");
        txtPrevisaoTouro.setText("Um momento de descanso será importante depois de uma semana intensa.");
        txtPrevisaoGemeos.setText("Boas conversas podem deixar seu dia mais leve e divertido.");
        txtPrevisaoCancer.setText("Aproveite o dia para estar perto de pessoas que fazem você bem.");
        txtPrevisaoLeao.setText("Seu entusiasmo pode contagiar as pessoas ao seu redor.");
        txtPrevisaoVirgem.setText("Conclua suas principais tarefas e permita-se relaxar depois.");
        txtPrevisaoLibra.setText("Um momento agradável pode ajudar a terminar a semana com equilíbrio.");
        txtPrevisaoEscorpiao.setText("Você conseguiu superar desafios. Agora aproveite para respirar um pouco.");
        txtPrevisaoSagitario.setText("O fim da semana favorece momentos de diversão e novas experiências.");
        txtPrevisaoCapricornio.setText("Valorize tudo o que conseguiu realizar durante a semana.");
        txtPrevisaoAquarios.setText("Faça algo diferente para quebrar a rotina.");
        txtPrevisaoPeixes.setText("Permita-se descansar e recarregar as energias para os próximos dias.");
        break;
    case 6: // SÁBADO
        txtPrevisaoAries.setText("Um dia ótimo para se divertir, explorar lugares novos e aproveitar sua energia.");
        txtPrevisaoTouro.setText("Aproveite o dia para descansar e fazer algo que realmente gosta.");
        txtPrevisaoGemeos.setText("Um passeio ou encontro pode trazer boas conversas e diversão.");
        txtPrevisaoCancer.setText("Um momento em família pode tornar seu dia ainda mais especial.");
        txtPrevisaoLeao.setText("Hoje é um bom dia para aproveitar os holofotes e se divertir.");
        txtPrevisaoVirgem.setText("Não transforme o descanso em mais uma lista de tarefas.");
        txtPrevisaoLibra.setText("Procure ambientes agradáveis e pessoas que tragam boas energias.");
        txtPrevisaoEscorpiao.setText("Um momento de tranquilidade pode ajudar você a recuperar as energias.");
        txtPrevisaoSagitario.setText("A aventura está chamando. Aproveite para experimentar algo novo.");
        txtPrevisaoCapricornio.setText("Deixe um pouco o trabalho de lado e aproveite seu tempo livre.");
        txtPrevisaoAquarios.setText("Um programa diferente pode tornar seu sábado inesquecível.");
        txtPrevisaoPeixes.setText("Use sua criatividade para transformar o dia em algo especial.");
        break;
    case 7: // DOMINGO
        txtPrevisaoAries.setText("Desacelere um pouco e prepare-se para começar uma nova semana.");
        txtPrevisaoTouro.setText("Aproveite o domingo para descansar e recuperar suas energias.");
        txtPrevisaoGemeos.setText("Um momento tranquilo pode ajudar você a organizar as ideias para a próxima semana.");
        txtPrevisaoCancer.setText("Passe um tempo com quem você ama e valorize os momentos simples.");
        txtPrevisaoLeao.setText("Cuide de si e aproveite o dia fazendo algo que traz felicidade.");
        txtPrevisaoVirgem.setText("Organize apenas o necessário e reserve tempo para descansar.");
        txtPrevisaoLibra.setText("Busque tranquilidade e equilíbrio antes de começar uma nova semana.");
        txtPrevisaoEscorpiao.setText("Reflita sobre a semana e deixe para trás aquilo que não vale a pena carregar.");
        txtPrevisaoSagitario.setText("Planeje uma nova aventura ou objetivo para os próximos dias.");
        txtPrevisaoCapricornio.setText("Recarregue suas energias e prepare-se para os próximos desafios.");
        txtPrevisaoAquarios.setText("Use o domingo para pensar em novas ideias e possibilidades.");
        txtPrevisaoPeixes.setText("Descanse, cuide dos seus sentimentos e confie mais na sua intuição.");
        break;
}
  
   }
   
   public void PreencherMensagem(){
   //CAPTURAR   DIA     DA    SEMANA 
    int diaSemana = LocalDate.now().getDayOfWeek().getValue();
    
    //condicional
  switch(diaSemana){
    case 1: // segunda-feira
        txMensagemAries.setText("Acredite na sua força e dê o primeiro passo.");
        txMensagemTouro.setText("Tenha paciência, boas coisas acontecem no tempo certo.");
        txMensagemGemeos.setText("Uma nova ideia pode transformar seu dia.");
        txMensagemCancer.setText("Valorize quem está ao seu lado e também cuide de você.");
        txMensagemLeao.setText("Brilhe com confiança, mas não esqueça de valorizar quem está ao seu redor.");
        txMensagemVirgem.setText("Organize seus pensamentos e siga com tranquilidade.");
        txMensagemLibra.setText("Encontre equilíbrio entre aquilo que você deseja e aquilo que precisa.");
        txMensagemEscorpiao.setText("Confie na sua força para superar qualquer desafio.");
        txMensagemSagitario.setText("Permita-se sonhar grande e buscar novas experiências.");
        txMensagemCapricornio.setText("Cada pequeno passo aproxima você dos seus objetivos.");
        txMensagemAquario.setText("Sua criatividade pode transformar uma ideia simples em algo especial.");
        txMensagemPeixes.setText("Confie na sua intuição e não tenha medo de seguir seu coração.");
        break;
    case 2: // terça-feira
        txMensagemAries.setText("Não tenha medo de começar algo novo.");
        txMensagemTouro.setText("Valorize as pequenas conquistas do seu dia.");
        txMensagemGemeos.setText("Uma boa conversa pode trazer uma grande oportunidade.");
        txMensagemCancer.setText("Seu carinho pode fazer a diferença na vida de alguém.");
        txMensagemLeao.setText("Acredite no seu potencial e mostre o que você sabe fazer.");
        txMensagemVirgem.setText("Faça o seu melhor sem exigir perfeição de si mesmo.");
        txMensagemLibra.setText("Uma escolha tranquila pode trazer mais equilíbrio para sua vida.");
        txMensagemEscorpiao.setText("Deixe para trás aquilo que impede você de seguir em frente.");
        txMensagemSagitario.setText("Mantenha o otimismo mesmo quando os planos mudarem.");
        txMensagemCapricornio.setText("Sua dedicação será importante para alcançar aquilo que deseja.");
        txMensagemAquario.setText("Não tenha medo de pensar diferente.");
        txMensagemPeixes.setText("Sua sensibilidade é uma força, use-a com sabedoria.");
        break;
    case 3: // quarta-feira
        txMensagemAries.setText("Sua coragem pode abrir novos caminhos.");
        txMensagemTouro.setText("Continue firme, mesmo que os resultados ainda não apareçam.");
        txMensagemGemeos.setText("Curiosidade é o primeiro passo para descobrir algo novo.");
        txMensagemCancer.setText("Um momento de carinho pode deixar seu dia mais leve.");
        txMensagemLeao.setText("Você tem motivos para se orgulhar do seu caminho.");
        txMensagemVirgem.setText("Respire fundo e resolva uma coisa de cada vez.");
        txMensagemLibra.setText("Nem sempre é preciso escolher rapidamente. Dê tempo às suas decisões.");
        txMensagemEscorpiao.setText("Sua determinação será maior do que qualquer obstáculo.");
        txMensagemSagitario.setText("Uma mudança de planos pode levar você a uma experiência interessante.");
        txMensagemCapricornio.setText("Continue construindo seu futuro com dedicação.");
        txMensagemAquario.setText("Uma ideia inesperada pode ser exatamente o que você precisava.");
        txMensagemPeixes.setText("Reserve um momento para descansar e cuidar da sua energia.");
        break;
    case 4: // quinta-feira
        txMensagemAries.setText("Transforme sua energia em atitude e faça acontecer.");
        txMensagemTouro.setText("A tranquilidade também pode ser uma forma de força.");
        txMensagemGemeos.setText("Compartilhe suas ideias, alguém pode precisar delas.");
        txMensagemCancer.setText("Não tenha vergonha de demonstrar aquilo que sente.");
        txMensagemLeao.setText("Sua presença pode tornar o dia de alguém melhor.");
        txMensagemVirgem.setText("Confie no trabalho que você está realizando.");
        txMensagemLibra.setText("Procure a paz, mas não deixe de defender aquilo que acredita.");
        txMensagemEscorpiao.setText("Você é capaz de recomeçar quantas vezes forem necessárias.");
        txMensagemSagitario.setText("Mantenha o espírito aventureiro e aproveite as oportunidades.");
        txMensagemCapricornio.setText("Disciplina hoje pode trazer liberdade amanhã.");
        txMensagemAquario.setText("Suas ideias únicas merecem espaço.");
        txMensagemPeixes.setText("Permita que sua imaginação inspire suas escolhas.");
        break;
    case 5: // sexta-feira
        txMensagemAries.setText("Termine a semana reconhecendo tudo o que você conseguiu conquistar.");
        txMensagemTouro.setText("Depois de tanto esforço, permita-se descansar.");
        txMensagemGemeos.setText("Boas companhias podem deixar seu dia ainda melhor.");
        txMensagemCancer.setText("Valorize os momentos simples ao lado de quem você ama.");
        txMensagemLeao.setText("Aproveite o dia e não tenha medo de comemorar suas conquistas.");
        txMensagemVirgem.setText("Você fez o que podia. Agora permita-se relaxar.");
        txMensagemLibra.setText("Um pouco de diversão pode trazer o equilíbrio que você precisa.");
        txMensagemEscorpiao.setText("Você venceu desafios que pareciam maiores do que realmente eram.");
        txMensagemSagitario.setText("O fim da semana combina com novas experiências.");
        txMensagemCapricornio.setText("Olhe para trás e reconheça o quanto você avançou.");
        txMensagemAquario.setText("Faça algo diferente e aproveite o momento.");
        txMensagemPeixes.setText("Descanse sua mente e aproveite as coisas que fazem você feliz.");
        break;
    case 6: // sábado
        txMensagemAries.setText("Hoje é dia de aproveitar sua energia e se divertir.");
        txMensagemTouro.setText("Aproveite o conforto das coisas simples.");
        txMensagemGemeos.setText("Uma conversa inesperada pode se transformar em uma boa lembrança.");
        txMensagemCancer.setText("Família e pessoas queridas podem deixar seu dia especial.");
        txMensagemLeao.setText("Hoje você merece aproveitar os holofotes.");
        txMensagemVirgem.setText("Nem tudo precisa estar organizado. Aproveite o momento.");
        txMensagemLibra.setText("Cerque-se de beleza, tranquilidade e boas companhias.");
        txMensagemEscorpiao.setText("Deixe as preocupações de lado e aproveite seu tempo.");
        txMensagemSagitario.setText("Uma pequena aventura pode tornar seu sábado inesquecível.");
        txMensagemCapricornio.setText("Descanse sem culpa. Você também precisa recarregar as energias.");
        txMensagemAquario.setText("Faça algo fora do comum e divirta-se.");
        txMensagemPeixes.setText("Use sua criatividade para tornar o dia mais especial.");
        break;
    case 7: // domingo
        txMensagemAries.setText("Descanse hoje para começar a próxima semana com energia.");
        txMensagemTouro.setText("Aproveite a tranquilidade e cuide de si.");
        txMensagemGemeos.setText("Organize seus pensamentos e prepare-se para uma nova semana.");
        txMensagemCancer.setText("Passe tempo com quem faz seu coração se sentir em casa.");
        txMensagemLeao.setText("Cuide de você e lembre-se de tudo o que já conquistou.");
        txMensagemVirgem.setText("Não transforme o domingo em mais um dia de trabalho.");
        txMensagemLibra.setText("Encontre um momento de paz antes de começar uma nova semana.");
        txMensagemEscorpiao.setText("Deixe o passado descansar e prepare-se para novos caminhos.");
        txMensagemSagitario.setText("Comece a planejar sua próxima aventura.");
        txMensagemCapricornio.setText("Descanse hoje para voltar aos seus objetivos com mais força.");
        txMensagemAquario.setText("Use o dia para imaginar novas possibilidades.");
        txMensagemPeixes.setText("Cuide da sua paz e permita-se sonhar.");
        break;
}
   
   }
   
   public void CorrigirAreasTextos(){
   //CORRIGIR   MENSAGEM 
   txMensagemAries.setLineWrap(true);
    txMensagemAries.setWrapStyleWord(true);
    txMensagemTouro.setLineWrap(true);
    txMensagemTouro.setWrapStyleWord(true);
    txMensagemGemeos.setLineWrap(true);
    txMensagemGemeos.setWrapStyleWord(true);
    txMensagemCancer.setLineWrap(true);
    txMensagemCancer.setWrapStyleWord(true);
    txMensagemLeao.setLineWrap(true);
    txMensagemLeao.setWrapStyleWord(true);
    txMensagemVirgem.setLineWrap(true);
    txMensagemVirgem.setWrapStyleWord(true);
    txMensagemLibra.setLineWrap(true);
    txMensagemLibra.setWrapStyleWord(true);
    txMensagemEscorpiao.setLineWrap(true);
    txMensagemEscorpiao.setWrapStyleWord(true);
    txMensagemSagitario.setLineWrap(true);
    txMensagemSagitario.setWrapStyleWord(true);
    txMensagemCapricornio.setLineWrap(true);
    txMensagemCapricornio.setWrapStyleWord(true);
    txMensagemAquario.setLineWrap(true);
    txMensagemAquario.setWrapStyleWord(true);
    txMensagemPeixes.setLineWrap(true);
    txMensagemPeixes.setWrapStyleWord(true);
   
   //CORRIGIR    PREVISAO
   txtPrevisaoAries.setLineWrap(true);
    txtPrevisaoAries.setWrapStyleWord(true);
    txtPrevisaoTouro.setLineWrap(true);
    txtPrevisaoTouro.setWrapStyleWord(true);
    txtPrevisaoGemeos.setLineWrap(true);
    txtPrevisaoGemeos.setWrapStyleWord(true);
    txtPrevisaoCancer.setLineWrap(true);
    txtPrevisaoCancer.setWrapStyleWord(true);
    txtPrevisaoLeao.setLineWrap(true);
    txtPrevisaoLeao.setWrapStyleWord(true);
    txtPrevisaoVirgem.setLineWrap(true);
    txtPrevisaoVirgem.setWrapStyleWord(true);
    txtPrevisaoLibra.setLineWrap(true);
    txtPrevisaoLibra.setWrapStyleWord(true);
    txtPrevisaoEscorpiao.setLineWrap(true);
    txtPrevisaoEscorpiao.setWrapStyleWord(true);
    txtPrevisaoSagitario.setLineWrap(true);
    txtPrevisaoSagitario.setWrapStyleWord(true);
    txtPrevisaoCapricornio.setLineWrap(true);
    txtPrevisaoCapricornio.setWrapStyleWord(true);
    txtPrevisaoAquarios.setLineWrap(true);
    txtPrevisaoAquarios.setWrapStyleWord(true);
    txtPrevisaoPeixes.setLineWrap(true);
    txtPrevisaoPeixes.setWrapStyleWord(true);
            
   //corrigir PONTOS      FORTES
    txFortesAries.setLineWrap(true);
    txFortesAries.setWrapStyleWord(true);
    txFortesTouro.setLineWrap(true);
    txFortesTouro.setWrapStyleWord(true);
    txFortesGemeos.setLineWrap(true);
    txFortesGemeos.setWrapStyleWord(true);
    txFortesCancer.setLineWrap(true);
    txFortesCancer.setWrapStyleWord(true);
    txFortesLeao.setLineWrap(true);
    txFortesLeao.setWrapStyleWord(true);
    txFortesVirgem.setLineWrap(true);
    txFortesVirgem.setWrapStyleWord(true);
    txFortesLibra.setLineWrap(true);
    txFortesLibra.setWrapStyleWord(true);
    txFortesEscorpiao.setLineWrap(true);
    txFortesEscorpiao.setWrapStyleWord(true);
    txFortesSagitario.setLineWrap(true);
    txFortesSagitario.setWrapStyleWord(true);
    txFortesCapricornio.setLineWrap(true);
    txFortesCapricornio.setWrapStyleWord(true);
    txFortesAquario.setLineWrap(true);
    txFortesAquario.setWrapStyleWord(true);
    txFortesPeixes.setLineWrap(true);
    txFortesPeixes.setWrapStyleWord(true);
    
  //corrigir  PONTOS    A     MELHORAR
   txMelhorarAries.setLineWrap(true);
    txMelhorarAries.setWrapStyleWord(true);
    txMelhorarTouro.setLineWrap(true);
    txMelhorarTouro.setWrapStyleWord(true);
    txMelhorarGemeos.setLineWrap(true);
    txMelhorarGemeos.setWrapStyleWord(true);
    txMelhorarCancer.setLineWrap(true);
    txMelhorarCancer.setWrapStyleWord(true);
    txMelhorarLeao.setLineWrap(true);
    txMelhorarLeao.setWrapStyleWord(true);
    txMelhorarVirgem.setLineWrap(true);
    txMelhorarVirgem.setWrapStyleWord(true);
    txMelhorarLibra.setLineWrap(true);
    txMelhorarLibra.setWrapStyleWord(true);
    txMelhorarEscorpiao.setLineWrap(true);
    txMelhorarEscorpiao.setWrapStyleWord(true);
    txMelhorarSagitario.setLineWrap(true);
    txMelhorarSagitario.setWrapStyleWord(true);
    txMelhorarCapricornio.setLineWrap(true);
    txMelhorarCapricornio.setWrapStyleWord(true);
    txMelhorarAquario.setLineWrap(true);
    txMelhorarAquario.setWrapStyleWord(true);
    txMelhorarPeixes.setLineWrap(true);
    txMelhorarPeixes.setWrapStyleWord(true);

   }//fim do metodo
   
   public void  CalcularSigno(){
   //capturar dados da combobox
   //convertendo texto em numero inteiro Integer, Double, Boolean)
   int dia = Integer.parseInt(cbDia.getSelectedItem().toString());
   String mes = cbMes.getSelectedItem().toString();
   //variavel que guarda as imagens do signo
   ImageIcon imagem = null;
   
   //verificar dia e mes dos signos com if else
   if((mes.equalsIgnoreCase("Março")&& dia>=21) || (mes.equalsIgnoreCase("Abril")&& dia<=19)  ){
   signo.setText("Áries");
  imagem = (ImageIcon) imgSignoAries.getIcon();//captura sua imagem
   
   }else if((mes.equalsIgnoreCase("Abril")&& dia>=20) || (mes.equalsIgnoreCase("Maio")&& dia<=20)  ){
   signo.setText("Touro");
  imagem = (ImageIcon) imgSignoTouro.getIcon();//captura sua imagem
  
  }else if((mes.equalsIgnoreCase("Maio") && dia >= 21) || 
         (mes.equalsIgnoreCase("Junho") && dia <= 20)){

    signo.setText("Gêmeos");
    imagem = (ImageIcon) imgSignoGemeos.getIcon();

}else if((mes.equalsIgnoreCase("Junho") && dia >= 21) || 
         (mes.equalsIgnoreCase("Julho") && dia <= 22)){

    signo.setText("Câncer");
    imagem = (ImageIcon) imgSignoCancer.getIcon();

}else if((mes.equalsIgnoreCase("Julho") && dia >= 23) || 
         (mes.equalsIgnoreCase("Agosto") && dia <= 22)){

    signo.setText("Leão");
    imagem = (ImageIcon) imgSignoLeao.getIcon();

}else if((mes.equalsIgnoreCase("Agosto") && dia >= 23) || 
         (mes.equalsIgnoreCase("Setembro") && dia <= 22)){

    signo.setText("Virgem");
    imagem = (ImageIcon) imgSignoVirgem.getIcon();

}else if((mes.equalsIgnoreCase("Setembro") && dia >= 23) || 
         (mes.equalsIgnoreCase("Outubro") && dia <= 22)){

    signo.setText("Libra");
    imagem = (ImageIcon) imgSignoLibra.getIcon();

}else if((mes.equalsIgnoreCase("Outubro") && dia >= 23) || 
         (mes.equalsIgnoreCase("Novembro") && dia <= 21)){

    signo.setText("Escorpião");
    imagem = (ImageIcon) imgSignoEscorpiao.getIcon();

}else if((mes.equalsIgnoreCase("Novembro") && dia >= 22) || 
         (mes.equalsIgnoreCase("Dezembro") && dia <= 21)){

    signo.setText("Sagitário");
    imagem = (ImageIcon) imgSignoSagitario.getIcon();

}else if((mes.equalsIgnoreCase("Dezembro") && dia >= 22) || 
         (mes.equalsIgnoreCase("Janeiro") && dia <= 19)){

    signo.setText("Capricórnio");
    imagem = (ImageIcon) imgSignoCapricornio.getIcon();

}else if((mes.equalsIgnoreCase("Janeiro") && dia >= 20) || 
         (mes.equalsIgnoreCase("Fevereiro") && dia <= 18)){

    signo.setText("Aquário");
    imagem = (ImageIcon) imgSignoAquario.getIcon();

}else if((mes.equalsIgnoreCase("Fevereiro") && dia >= 19) || 
         (mes.equalsIgnoreCase("Março") && dia <= 20)){

    signo.setText("Peixes");
    imagem = (ImageIcon) imgSignoPeixes.getIcon();
   
   }
   Image imgRedimensionada = imagem.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
   //Para preencher o botao dos signos
   btnSigno.setIcon(new ImageIcon(imgRedimensionada));
   
   }//fim do calcular signo
   
   public void CalcularCompatibilidade(){
   String signo1 = cbSigno1.getSelectedItem().toString();
      String signo2 = cbSigno2.getSelectedItem().toString();
      
      if(signo1.equalsIgnoreCase("áries") &&
   signo2.equalsIgnoreCase("áries")){
    tfCompatibilidade.setText("80% compatibilidade!");

}else if(signo1.equalsIgnoreCase("áries") &&
         signo2.equalsIgnoreCase("touro")){
    tfCompatibilidade.setText("70% compatibilidade!");

}else if(signo1.equalsIgnoreCase("áries") &&
         signo2.equalsIgnoreCase("gêmeos")){
    tfCompatibilidade.setText("75% compatibilidade!");

}else if(signo1.equalsIgnoreCase("áries") &&
         signo2.equalsIgnoreCase("câncer")){
    tfCompatibilidade.setText("55% compatibilidade!");

}else if(signo1.equalsIgnoreCase("áries") &&
         signo2.equalsIgnoreCase("leão")){
    tfCompatibilidade.setText("95% compatibilidade!");

}else if(signo1.equalsIgnoreCase("áries") &&
         signo2.equalsIgnoreCase("virgem")){
    tfCompatibilidade.setText("60% compatibilidade!");

}else if(signo1.equalsIgnoreCase("áries") &&
         signo2.equalsIgnoreCase("libra")){
    tfCompatibilidade.setText("78% compatibilidade!");

}else if(signo1.equalsIgnoreCase("áries") &&
         signo2.equalsIgnoreCase("escorpião")){
    tfCompatibilidade.setText("68% compatibilidade!");

}else if(signo1.equalsIgnoreCase("áries") &&
         signo2.equalsIgnoreCase("sagitário")){
    tfCompatibilidade.setText("92% compatibilidade!");

}else if(signo1.equalsIgnoreCase("áries") &&
         signo2.equalsIgnoreCase("capricórnio")){
    tfCompatibilidade.setText("58% compatibilidade!");

}else if(signo1.equalsIgnoreCase("áries") &&
         signo2.equalsIgnoreCase("aquário")){
    tfCompatibilidade.setText("85% compatibilidade!");

}else if(signo1.equalsIgnoreCase("áries") &&
         signo2.equalsIgnoreCase("peixes")){
    tfCompatibilidade.setText("62% compatibilidade!");



// TOURO

}else if(signo1.equalsIgnoreCase("touro") &&
         signo2.equalsIgnoreCase("áries")){
    tfCompatibilidade.setText("70% compatibilidade!");

}else if(signo1.equalsIgnoreCase("touro") &&
         signo2.equalsIgnoreCase("touro")){
    tfCompatibilidade.setText("90% compatibilidade!");

}else if(signo1.equalsIgnoreCase("touro") &&
         signo2.equalsIgnoreCase("gêmeos")){
    tfCompatibilidade.setText("65% compatibilidade!");

}else if(signo1.equalsIgnoreCase("touro") &&
         signo2.equalsIgnoreCase("câncer")){
    tfCompatibilidade.setText("92% compatibilidade!");

}else if(signo1.equalsIgnoreCase("touro") &&
         signo2.equalsIgnoreCase("leão")){
    tfCompatibilidade.setText("63% compatibilidade!");

}else if(signo1.equalsIgnoreCase("touro") &&
         signo2.equalsIgnoreCase("virgem")){
    tfCompatibilidade.setText("95% compatibilidade!");

}else if(signo1.equalsIgnoreCase("touro") &&
         signo2.equalsIgnoreCase("libra")){
    tfCompatibilidade.setText("76% compatibilidade!");

}else if(signo1.equalsIgnoreCase("touro") &&
         signo2.equalsIgnoreCase("escorpião")){
    tfCompatibilidade.setText("82% compatibilidade!");

}else if(signo1.equalsIgnoreCase("touro") &&
         signo2.equalsIgnoreCase("sagitário")){
    tfCompatibilidade.setText("57% compatibilidade!");

}else if(signo1.equalsIgnoreCase("touro") &&
         signo2.equalsIgnoreCase("capricórnio")){
    tfCompatibilidade.setText("96% compatibilidade!");

}else if(signo1.equalsIgnoreCase("touro") &&
         signo2.equalsIgnoreCase("aquário")){
    tfCompatibilidade.setText("54% compatibilidade!");

}else if(signo1.equalsIgnoreCase("touro") &&
         signo2.equalsIgnoreCase("peixes")){
    tfCompatibilidade.setText("88% compatibilidade!");



// GÊMEOS

}else if(signo1.equalsIgnoreCase("gêmeos") &&
         signo2.equalsIgnoreCase("áries")){
    tfCompatibilidade.setText("75% compatibilidade!");

}else if(signo1.equalsIgnoreCase("gêmeos") &&
         signo2.equalsIgnoreCase("touro")){
    tfCompatibilidade.setText("65% compatibilidade!");

}else if(signo1.equalsIgnoreCase("gêmeos") &&
         signo2.equalsIgnoreCase("gêmeos")){
    tfCompatibilidade.setText("85% compatibilidade!");

}else if(signo1.equalsIgnoreCase("gêmeos") &&
         signo2.equalsIgnoreCase("câncer")){
    tfCompatibilidade.setText("70% compatibilidade!");

}else if(signo1.equalsIgnoreCase("gêmeos") &&
         signo2.equalsIgnoreCase("leão")){
    tfCompatibilidade.setText("86% compatibilidade!");

}else if(signo1.equalsIgnoreCase("gêmeos") &&
         signo2.equalsIgnoreCase("virgem")){
    tfCompatibilidade.setText("72% compatibilidade!");

}else if(signo1.equalsIgnoreCase("gêmeos") &&
         signo2.equalsIgnoreCase("libra")){
    tfCompatibilidade.setText("94% compatibilidade!");

}else if(signo1.equalsIgnoreCase("gêmeos") &&
         signo2.equalsIgnoreCase("escorpião")){
    tfCompatibilidade.setText("64% compatibilidade!");

}else if(signo1.equalsIgnoreCase("gêmeos") &&
         signo2.equalsIgnoreCase("sagitário")){
    tfCompatibilidade.setText("82% compatibilidade!");

}else if(signo1.equalsIgnoreCase("gêmeos") &&
         signo2.equalsIgnoreCase("capricórnio")){
    tfCompatibilidade.setText("60% compatibilidade!");

}else if(signo1.equalsIgnoreCase("gêmeos") &&
         signo2.equalsIgnoreCase("aquário")){
    tfCompatibilidade.setText("96% compatibilidade!");

}else if(signo1.equalsIgnoreCase("gêmeos") &&
         signo2.equalsIgnoreCase("peixes")){
    tfCompatibilidade.setText("68% compatibilidade!");



// CÂNCER

}else if(signo1.equalsIgnoreCase("câncer") &&
         signo2.equalsIgnoreCase("áries")){
    tfCompatibilidade.setText("55% compatibilidade!");

}else if(signo1.equalsIgnoreCase("câncer") &&
         signo2.equalsIgnoreCase("touro")){
    tfCompatibilidade.setText("92% compatibilidade!");

}else if(signo1.equalsIgnoreCase("câncer") &&
         signo2.equalsIgnoreCase("gêmeos")){
    tfCompatibilidade.setText("70% compatibilidade!");

}else if(signo1.equalsIgnoreCase("câncer") &&
         signo2.equalsIgnoreCase("câncer")){
    tfCompatibilidade.setText("88% compatibilidade!");

}else if(signo1.equalsIgnoreCase("câncer") &&
         signo2.equalsIgnoreCase("leão")){
    tfCompatibilidade.setText("72% compatibilidade!");

}else if(signo1.equalsIgnoreCase("câncer") &&
         signo2.equalsIgnoreCase("virgem")){
    tfCompatibilidade.setText("84% compatibilidade!");

}else if(signo1.equalsIgnoreCase("câncer") &&
         signo2.equalsIgnoreCase("libra")){
    tfCompatibilidade.setText("65% compatibilidade!");

}else if(signo1.equalsIgnoreCase("câncer") &&
         signo2.equalsIgnoreCase("escorpião")){
    tfCompatibilidade.setText("96% compatibilidade!");

}else if(signo1.equalsIgnoreCase("câncer") &&
         signo2.equalsIgnoreCase("sagitário")){
    tfCompatibilidade.setText("58% compatibilidade!");

}else if(signo1.equalsIgnoreCase("câncer") &&
         signo2.equalsIgnoreCase("capricórnio")){
    tfCompatibilidade.setText("78% compatibilidade!");

}else if(signo1.equalsIgnoreCase("câncer") &&
         signo2.equalsIgnoreCase("aquário")){
    tfCompatibilidade.setText("60% compatibilidade!");

}else if(signo1.equalsIgnoreCase("câncer") &&
         signo2.equalsIgnoreCase("peixes")){
    tfCompatibilidade.setText("97% compatibilidade!");



// LEÃO

}else if(signo1.equalsIgnoreCase("leão") &&
         signo2.equalsIgnoreCase("áries")){
    tfCompatibilidade.setText("95% compatibilidade!");

}else if(signo1.equalsIgnoreCase("leão") &&
         signo2.equalsIgnoreCase("touro")){
    tfCompatibilidade.setText("63% compatibilidade!");

}else if(signo1.equalsIgnoreCase("leão") &&
         signo2.equalsIgnoreCase("gêmeos")){
    tfCompatibilidade.setText("86% compatibilidade!");

}else if(signo1.equalsIgnoreCase("leão") &&
         signo2.equalsIgnoreCase("câncer")){
    tfCompatibilidade.setText("72% compatibilidade!");

}else if(signo1.equalsIgnoreCase("leão") &&
         signo2.equalsIgnoreCase("leão")){
    tfCompatibilidade.setText("88% compatibilidade!");

}else if(signo1.equalsIgnoreCase("leão") &&
         signo2.equalsIgnoreCase("virgem")){
    tfCompatibilidade.setText("62% compatibilidade!");

}else if(signo1.equalsIgnoreCase("leão") &&
         signo2.equalsIgnoreCase("libra")){
    tfCompatibilidade.setText("88% compatibilidade!");

}else if(signo1.equalsIgnoreCase("leão") &&
         signo2.equalsIgnoreCase("escorpião")){
    tfCompatibilidade.setText("70% compatibilidade!");

}else if(signo1.equalsIgnoreCase("leão") &&
         signo2.equalsIgnoreCase("sagitário")){
    tfCompatibilidade.setText("95% compatibilidade!");

}else if(signo1.equalsIgnoreCase("leão") &&
         signo2.equalsIgnoreCase("capricórnio")){
    tfCompatibilidade.setText("60% compatibilidade!");

}else if(signo1.equalsIgnoreCase("leão") &&
         signo2.equalsIgnoreCase("aquário")){
    tfCompatibilidade.setText("80% compatibilidade!");

}else if(signo1.equalsIgnoreCase("leão") &&
         signo2.equalsIgnoreCase("peixes")){
    tfCompatibilidade.setText("65% compatibilidade!");



// VIRGEM

}else if(signo1.equalsIgnoreCase("virgem") &&
         signo2.equalsIgnoreCase("áries")){
    tfCompatibilidade.setText("60% compatibilidade!");

}else if(signo1.equalsIgnoreCase("virgem") &&
         signo2.equalsIgnoreCase("touro")){
    tfCompatibilidade.setText("95% compatibilidade!");

}else if(signo1.equalsIgnoreCase("virgem") &&
         signo2.equalsIgnoreCase("gêmeos")){
    tfCompatibilidade.setText("72% compatibilidade!");

}else if(signo1.equalsIgnoreCase("virgem") &&
         signo2.equalsIgnoreCase("câncer")){
    tfCompatibilidade.setText("84% compatibilidade!");

}else if(signo1.equalsIgnoreCase("virgem") &&
         signo2.equalsIgnoreCase("leão")){
    tfCompatibilidade.setText("62% compatibilidade!");

}else if(signo1.equalsIgnoreCase("virgem") &&
         signo2.equalsIgnoreCase("virgem")){
    tfCompatibilidade.setText("90% compatibilidade!");

}else if(signo1.equalsIgnoreCase("virgem") &&
         signo2.equalsIgnoreCase("libra")){
    tfCompatibilidade.setText("70% compatibilidade!");

}else if(signo1.equalsIgnoreCase("virgem") &&
         signo2.equalsIgnoreCase("escorpião")){
    tfCompatibilidade.setText("82% compatibilidade!");

}else if(signo1.equalsIgnoreCase("virgem") &&
         signo2.equalsIgnoreCase("sagitário")){
    tfCompatibilidade.setText("58% compatibilidade!");

}else if(signo1.equalsIgnoreCase("virgem") &&
         signo2.equalsIgnoreCase("capricórnio")){
    tfCompatibilidade.setText("96% compatibilidade!");

}else if(signo1.equalsIgnoreCase("virgem") &&
         signo2.equalsIgnoreCase("aquário")){
    tfCompatibilidade.setText("65% compatibilidade!");

}else if(signo1.equalsIgnoreCase("virgem") &&
         signo2.equalsIgnoreCase("peixes")){
    tfCompatibilidade.setText("76% compatibilidade!");



// LIBRA

}else if(signo1.equalsIgnoreCase("libra") &&
         signo2.equalsIgnoreCase("áries")){
    tfCompatibilidade.setText("78% compatibilidade!");

}else if(signo1.equalsIgnoreCase("libra") &&
         signo2.equalsIgnoreCase("touro")){
    tfCompatibilidade.setText("76% compatibilidade!");

}else if(signo1.equalsIgnoreCase("libra") &&
         signo2.equalsIgnoreCase("gêmeos")){
    tfCompatibilidade.setText("94% compatibilidade!");

}else if(signo1.equalsIgnoreCase("libra") &&
         signo2.equalsIgnoreCase("câncer")){
    tfCompatibilidade.setText("65% compatibilidade!");

}else if(signo1.equalsIgnoreCase("libra") &&
         signo2.equalsIgnoreCase("leão")){
    tfCompatibilidade.setText("88% compatibilidade!");

}else if(signo1.equalsIgnoreCase("libra") &&
         signo2.equalsIgnoreCase("virgem")){
    tfCompatibilidade.setText("70% compatibilidade!");

}else if(signo1.equalsIgnoreCase("libra") &&
         signo2.equalsIgnoreCase("libra")){
    tfCompatibilidade.setText("90% compatibilidade!");

}else if(signo1.equalsIgnoreCase("libra") &&
         signo2.equalsIgnoreCase("escorpião")){
    tfCompatibilidade.setText("75% compatibilidade!");

}else if(signo1.equalsIgnoreCase("libra") &&
         signo2.equalsIgnoreCase("sagitário")){
    tfCompatibilidade.setText("84% compatibilidade!");

}else if(signo1.equalsIgnoreCase("libra") &&
         signo2.equalsIgnoreCase("capricórnio")){
    tfCompatibilidade.setText("62% compatibilidade!");

}else if(signo1.equalsIgnoreCase("libra") &&
         signo2.equalsIgnoreCase("aquário")){
    tfCompatibilidade.setText("94% compatibilidade!");

}else if(signo1.equalsIgnoreCase("libra") &&
         signo2.equalsIgnoreCase("peixes")){
    tfCompatibilidade.setText("78% compatibilidade!");



// ESCORPIÃO

}else if(signo1.equalsIgnoreCase("escorpião") &&
         signo2.equalsIgnoreCase("áries")){
    tfCompatibilidade.setText("68% compatibilidade!");

}else if(signo1.equalsIgnoreCase("escorpião") &&
         signo2.equalsIgnoreCase("touro")){
    tfCompatibilidade.setText("82% compatibilidade!");

}else if(signo1.equalsIgnoreCase("escorpião") &&
         signo2.equalsIgnoreCase("gêmeos")){
    tfCompatibilidade.setText("64% compatibilidade!");

}else if(signo1.equalsIgnoreCase("escorpião") &&
         signo2.equalsIgnoreCase("câncer")){
    tfCompatibilidade.setText("96% compatibilidade!");

}else if(signo1.equalsIgnoreCase("escorpião") &&
         signo2.equalsIgnoreCase("leão")){
    tfCompatibilidade.setText("70% compatibilidade!");

}else if(signo1.equalsIgnoreCase("escorpião") &&
         signo2.equalsIgnoreCase("virgem")){
    tfCompatibilidade.setText("82% compatibilidade!");

}else if(signo1.equalsIgnoreCase("escorpião") &&
         signo2.equalsIgnoreCase("libra")){
    tfCompatibilidade.setText("75% compatibilidade!");

}else if(signo1.equalsIgnoreCase("escorpião") &&
         signo2.equalsIgnoreCase("escorpião")){
    tfCompatibilidade.setText("92% compatibilidade!");

}else if(signo1.equalsIgnoreCase("escorpião") &&
         signo2.equalsIgnoreCase("sagitário")){
    tfCompatibilidade.setText("65% compatibilidade!");

}else if(signo1.equalsIgnoreCase("escorpião") &&
         signo2.equalsIgnoreCase("capricórnio")){
    tfCompatibilidade.setText("80% compatibilidade!");

}else if(signo1.equalsIgnoreCase("escorpião") &&
         signo2.equalsIgnoreCase("aquário")){
    tfCompatibilidade.setText("62% compatibilidade!");

}else if(signo1.equalsIgnoreCase("escorpião") &&
         signo2.equalsIgnoreCase("peixes")){
    tfCompatibilidade.setText("96% compatibilidade!");



// SAGITÁRIO

}else if(signo1.equalsIgnoreCase("sagitário") &&
         signo2.equalsIgnoreCase("áries")){
    tfCompatibilidade.setText("92% compatibilidade!");

}else if(signo1.equalsIgnoreCase("sagitário") &&
         signo2.equalsIgnoreCase("touro")){
    tfCompatibilidade.setText("57% compatibilidade!");

}else if(signo1.equalsIgnoreCase("sagitário") &&
         signo2.equalsIgnoreCase("gêmeos")){
    tfCompatibilidade.setText("82% compatibilidade!");

}else if(signo1.equalsIgnoreCase("sagitário") &&
         signo2.equalsIgnoreCase("câncer")){
    tfCompatibilidade.setText("58% compatibilidade!");

}else if(signo1.equalsIgnoreCase("sagitário") &&
         signo2.equalsIgnoreCase("leão")){
    tfCompatibilidade.setText("95% compatibilidade!");

}else if(signo1.equalsIgnoreCase("sagitário") &&
         signo2.equalsIgnoreCase("virgem")){
    tfCompatibilidade.setText("58% compatibilidade!");

}else if(signo1.equalsIgnoreCase("sagitário") &&
         signo2.equalsIgnoreCase("libra")){
    tfCompatibilidade.setText("84% compatibilidade!");

}else if(signo1.equalsIgnoreCase("sagitário") &&
         signo2.equalsIgnoreCase("escorpião")){
    tfCompatibilidade.setText("65% compatibilidade!");

}else if(signo1.equalsIgnoreCase("sagitário") &&
         signo2.equalsIgnoreCase("sagitário")){
    tfCompatibilidade.setText("90% compatibilidade!");

}else if(signo1.equalsIgnoreCase("sagitário") &&
         signo2.equalsIgnoreCase("capricórnio")){
    tfCompatibilidade.setText("65% compatibilidade!");

}else if(signo1.equalsIgnoreCase("sagitário") &&
         signo2.equalsIgnoreCase("aquário")){
    tfCompatibilidade.setText("88% compatibilidade!");

}else if(signo1.equalsIgnoreCase("sagitário") &&
         signo2.equalsIgnoreCase("peixes")){
    tfCompatibilidade.setText("68% compatibilidade!");



// CAPRICÓRNIO

}else if(signo1.equalsIgnoreCase("capricórnio") &&
         signo2.equalsIgnoreCase("áries")){
    tfCompatibilidade.setText("58% compatibilidade!");

}else if(signo1.equalsIgnoreCase("capricórnio") &&
         signo2.equalsIgnoreCase("touro")){
    tfCompatibilidade.setText("96% compatibilidade!");

}else if(signo1.equalsIgnoreCase("capricórnio") &&
         signo2.equalsIgnoreCase("gêmeos")){
    tfCompatibilidade.setText("60% compatibilidade!");

}else if(signo1.equalsIgnoreCase("capricórnio") &&
         signo2.equalsIgnoreCase("câncer")){
    tfCompatibilidade.setText("78% compatibilidade!");

}else if(signo1.equalsIgnoreCase("capricórnio") &&
         signo2.equalsIgnoreCase("leão")){
    tfCompatibilidade.setText("60% compatibilidade!");

}else if(signo1.equalsIgnoreCase("capricórnio") &&
         signo2.equalsIgnoreCase("virgem")){
    tfCompatibilidade.setText("96% compatibilidade!");

}else if(signo1.equalsIgnoreCase("capricórnio") &&
         signo2.equalsIgnoreCase("libra")){
    tfCompatibilidade.setText("62% compatibilidade!");

}else if(signo1.equalsIgnoreCase("capricórnio") &&
         signo2.equalsIgnoreCase("escorpião")){
    tfCompatibilidade.setText("80% compatibilidade!");

}else if(signo1.equalsIgnoreCase("capricórnio") &&
         signo2.equalsIgnoreCase("sagitário")){
    tfCompatibilidade.setText("65% compatibilidade!");

}else if(signo1.equalsIgnoreCase("capricórnio") &&
         signo2.equalsIgnoreCase("capricórnio")){
    tfCompatibilidade.setText("92% compatibilidade!");

}else if(signo1.equalsIgnoreCase("capricórnio") &&
         signo2.equalsIgnoreCase("aquário")){
    tfCompatibilidade.setText("64% compatibilidade!");

}else if(signo1.equalsIgnoreCase("capricórnio") &&
         signo2.equalsIgnoreCase("peixes")){
    tfCompatibilidade.setText("86% compatibilidade!");



// AQUÁRIO

}else if(signo1.equalsIgnoreCase("aquário") &&
         signo2.equalsIgnoreCase("áries")){
    tfCompatibilidade.setText("85% compatibilidade!");

}else if(signo1.equalsIgnoreCase("aquário") &&
         signo2.equalsIgnoreCase("touro")){
    tfCompatibilidade.setText("54% compatibilidade!");

}else if(signo1.equalsIgnoreCase("aquário") &&
         signo2.equalsIgnoreCase("gêmeos")){
    tfCompatibilidade.setText("96% compatibilidade!");

}else if(signo1.equalsIgnoreCase("aquário") &&
         signo2.equalsIgnoreCase("câncer")){
    tfCompatibilidade.setText("60% compatibilidade!");

}else if(signo1.equalsIgnoreCase("aquário") &&
         signo2.equalsIgnoreCase("leão")){
    tfCompatibilidade.setText("80% compatibilidade!");

}else if(signo1.equalsIgnoreCase("aquário") &&
         signo2.equalsIgnoreCase("virgem")){
    tfCompatibilidade.setText("65% compatibilidade!");

}else if(signo1.equalsIgnoreCase("aquário") &&
         signo2.equalsIgnoreCase("libra")){
    tfCompatibilidade.setText("94% compatibilidade!");

}else if(signo1.equalsIgnoreCase("aquário") &&
         signo2.equalsIgnoreCase("escorpião")){
    tfCompatibilidade.setText("62% compatibilidade!");

}else if(signo1.equalsIgnoreCase("aquário") &&
         signo2.equalsIgnoreCase("sagitário")){
    tfCompatibilidade.setText("88% compatibilidade!");

}else if(signo1.equalsIgnoreCase("aquário") &&
         signo2.equalsIgnoreCase("capricórnio")){
    tfCompatibilidade.setText("64% compatibilidade!");

}else if(signo1.equalsIgnoreCase("aquário") &&
         signo2.equalsIgnoreCase("aquário")){
    tfCompatibilidade.setText("90% compatibilidade!");

}else if(signo1.equalsIgnoreCase("aquário") &&
         signo2.equalsIgnoreCase("peixes")){
    tfCompatibilidade.setText("72% compatibilidade!");



// PEIXES

}else if(signo1.equalsIgnoreCase("peixes") &&
         signo2.equalsIgnoreCase("áries")){
    tfCompatibilidade.setText("62% compatibilidade!");

}else if(signo1.equalsIgnoreCase("peixes") &&
         signo2.equalsIgnoreCase("touro")){
    tfCompatibilidade.setText("88% compatibilidade!");

}else if(signo1.equalsIgnoreCase("peixes") &&
         signo2.equalsIgnoreCase("gêmeos")){
    tfCompatibilidade.setText("68% compatibilidade!");

}else if(signo1.equalsIgnoreCase("peixes") &&
         signo2.equalsIgnoreCase("câncer")){
    tfCompatibilidade.setText("97% compatibilidade!");

}else if(signo1.equalsIgnoreCase("peixes") &&
         signo2.equalsIgnoreCase("leão")){
    tfCompatibilidade.setText("65% compatibilidade!");

}else if(signo1.equalsIgnoreCase("peixes") &&
         signo2.equalsIgnoreCase("virgem")){
    tfCompatibilidade.setText("76% compatibilidade!");

}else if(signo1.equalsIgnoreCase("peixes") &&
         signo2.equalsIgnoreCase("libra")){
    tfCompatibilidade.setText("78% compatibilidade!");

}else if(signo1.equalsIgnoreCase("peixes") &&
         signo2.equalsIgnoreCase("escorpião")){
    tfCompatibilidade.setText("96% compatibilidade!");

}else if(signo1.equalsIgnoreCase("peixes") &&
         signo2.equalsIgnoreCase("sagitário")){
    tfCompatibilidade.setText("68% compatibilidade!");

}else if(signo1.equalsIgnoreCase("peixes") &&
         signo2.equalsIgnoreCase("capricórnio")){
    tfCompatibilidade.setText("86% compatibilidade!");

}else if(signo1.equalsIgnoreCase("peixes") &&
         signo2.equalsIgnoreCase("aquário")){
    tfCompatibilidade.setText("72% compatibilidade!");

}else if(signo1.equalsIgnoreCase("peixes") &&
         signo2.equalsIgnoreCase("peixes")){
    tfCompatibilidade.setText("95% compatibilidade!");

}else{
    tfCompatibilidade.setText("Compatibilidade não encontrada!");
}
   
   }// fim do calcilar compatibilidade
   
   public void TocarMusica() {
    try {//um if e else para erros. o try manda o erro pra o catch
        // Se a música já foi carregada, continuar a reprodução
        if (musica != null && musica.isOpen()) {
            musica.start();
            return;
        }

        // Localizar o arquivo dentro do projeto
        java.net.URL arquivo = getClass().getResource("/musica/wuji.wav");

        if (arquivo == null) {
            JOptionPane.showMessageDialog(this, "Arquivo de música não encontrado!");
            return;
        }

        // Abrir o áudio e carregar a música
        try (AudioInputStream audio = AudioSystem.getAudioInputStream(arquivo)) {
            musica = AudioSystem.getClip();
            musica.open(audio);
        }

        // Iniciar a reprodução
        musica.start();

    } catch (Exception erro) {
        JOptionPane.showMessageDialog(
                this,
                "Erro ao tocar a música: " + erro.getMessage()
        );
    }
}// Fim do TocarMusica
   
   public void PausarMusica() {
    if (musica != null && musica.isOpen()) {
        // Pausar na posição atual
        musica.stop();
    }
}// Fim do PausarMusica

public void PararMusica() {
    if (musica != null && musica.isOpen()) {
        // Parar e voltar ao início
        musica.stop();
        musica.setFramePosition(0);
    }
}// Fim do PararMusica
   
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        txPrevisaoAquario = new javax.swing.JTabbedPane();
        inicio = new javax.swing.JPanel();
        areaCompatibilidade = new javax.swing.JPanel();
        tituloCompatibilidade = new javax.swing.JLabel();
        signo1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbSigno1 = new javax.swing.JComboBox<>();
        cbSigno2 = new javax.swing.JComboBox<>();
        btnCalcular = new javax.swing.JButton();
        areaDescobrirSigno = new javax.swing.JPanel();
        tituloDescobrirSigno = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        diaNascimento = new javax.swing.JLabel();
        mesNascimento = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        cbDia = new javax.swing.JComboBox<>();
        cbMes = new javax.swing.JComboBox<>();
        btnDescobrirSigno = new javax.swing.JButton();
        areaResultado = new javax.swing.JPanel();
        signo = new javax.swing.JLabel();
        compatibilidade = new javax.swing.JLabel();
        btnSigno = new javax.swing.JButton();
        tfCompatibilidade = new javax.swing.JTextField();
        btnPlay = new javax.swing.JButton();
        btnPause = new javax.swing.JButton();
        fundoInicio = new javax.swing.JLabel();
        aries = new javax.swing.JPanel();
        areaEnergia = new javax.swing.JPanel();
        tituloEnergiaAries = new javax.swing.JLabel();
        amorAries = new javax.swing.JLabel();
        trabalhoAries = new javax.swing.JLabel();
        saudeAries = new javax.swing.JLabel();
        sorteAries = new javax.swing.JLabel();
        tfAmorAries = new javax.swing.JTextField();
        tfTrabalhoAries = new javax.swing.JTextField();
        tfSaudeAries = new javax.swing.JTextField();
        tfSorteAries = new javax.swing.JTextField();
        areaInformacoes = new javax.swing.JPanel();
        imgSignoAries = new javax.swing.JLabel();
        tituloAries = new javax.swing.JLabel();
        periodoAries = new javax.swing.JLabel();
        elementoAries = new javax.swing.JLabel();
        planetaAries = new javax.swing.JLabel();
        corAries = new javax.swing.JLabel();
        numeroAries = new javax.swing.JLabel();
        tfPeriodoAries = new javax.swing.JTextField();
        tfElementoAries = new javax.swing.JTextField();
        tfPlanetaAries = new javax.swing.JTextField();
        tfCorAries = new javax.swing.JTextField();
        tfNumeroAries = new javax.swing.JTextField();
        areaCaracteristicasAries = new javax.swing.JPanel();
        tituloCarecteristicasAries = new javax.swing.JLabel();
        pfortesAries = new javax.swing.JLabel();
        pMelhorarAries = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txFortesAries = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txMelhorarAries = new javax.swing.JTextArea();
        areaPrevisaoAries = new javax.swing.JPanel();
        previsaoAries = new javax.swing.JLabel();
        btnAtualizarPrevisaoAries = new javax.swing.JButton();
        txPrevisao = new javax.swing.JScrollPane();
        txtPrevisaoAries = new javax.swing.JTextArea();
        areaMensagem = new javax.swing.JPanel();
        tituloMensagemAries = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txMensagemAries = new javax.swing.JTextArea();
        btnCopiarMensagemAries = new javax.swing.JButton();
        fundoAries = new javax.swing.JLabel();
        touro = new javax.swing.JPanel();
        areaInformacaoTouro = new javax.swing.JPanel();
        imgSignoTouro = new javax.swing.JLabel();
        tituloTouro = new javax.swing.JLabel();
        periodoTouro = new javax.swing.JLabel();
        elementoTouro = new javax.swing.JLabel();
        planetaTouro = new javax.swing.JLabel();
        corTouro = new javax.swing.JLabel();
        numeroTouro = new javax.swing.JLabel();
        tfPeriodoTouro = new javax.swing.JTextField();
        tfElementoTouro = new javax.swing.JTextField();
        tfPlanetaTouro = new javax.swing.JTextField();
        tfCorTouro = new javax.swing.JTextField();
        tfNumeroTouro = new javax.swing.JTextField();
        areaCaracteristicasTouro = new javax.swing.JPanel();
        tituloCarecteristicasAries1 = new javax.swing.JLabel();
        pfortesTouro = new javax.swing.JLabel();
        pMelhorarTouro = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txFortesTouro = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        txMelhorarTouro = new javax.swing.JTextArea();
        areaPrevisaoTouro = new javax.swing.JPanel();
        previsaoTouro = new javax.swing.JLabel();
        btnAtualizarPrevisaoTouro = new javax.swing.JButton();
        txPrevisaoAries1 = new javax.swing.JScrollPane();
        txtPrevisaoTouro = new javax.swing.JTextArea();
        areaEnergiaTouro = new javax.swing.JPanel();
        tituloEnergiaAries1 = new javax.swing.JLabel();
        amorTouro = new javax.swing.JLabel();
        trabalhoTouro = new javax.swing.JLabel();
        saudeTouro = new javax.swing.JLabel();
        sorteTouro = new javax.swing.JLabel();
        tfAmorTouro = new javax.swing.JTextField();
        tfTrabalhoTouro = new javax.swing.JTextField();
        tfSaudeTouro = new javax.swing.JTextField();
        tfSorteTouro = new javax.swing.JTextField();
        areaMensagemTouro = new javax.swing.JPanel();
        tituloMensagemTouro = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txMensagemTouro = new javax.swing.JTextArea();
        btnCopiarMensagemTouro = new javax.swing.JButton();
        fundoTouro = new javax.swing.JLabel();
        gemeos = new javax.swing.JPanel();
        areaInformacoesGemeos = new javax.swing.JPanel();
        imgSignoGemeos = new javax.swing.JLabel();
        tituloGemeos = new javax.swing.JLabel();
        periodoGemeos = new javax.swing.JLabel();
        elementoGemeos = new javax.swing.JLabel();
        planetaGemeos = new javax.swing.JLabel();
        corGemeos = new javax.swing.JLabel();
        numeroGemeos = new javax.swing.JLabel();
        tfPeriodoGemeos = new javax.swing.JTextField();
        tfElementoGemeos = new javax.swing.JTextField();
        tfPlanetaGemeos = new javax.swing.JTextField();
        tfCorGemeos = new javax.swing.JTextField();
        tfNumeroGemeos = new javax.swing.JTextField();
        areaCaracteristicasGemeos = new javax.swing.JPanel();
        tituloCarecteristicasGemeos = new javax.swing.JLabel();
        pfortesGemeos = new javax.swing.JLabel();
        pMelhorarGemeos = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txFortesGemeos = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        txMelhorarGemeos = new javax.swing.JTextArea();
        areaPrevisaoGemeos = new javax.swing.JPanel();
        previsaoGemeos = new javax.swing.JLabel();
        btnAtualizarPrevisaoGemeos = new javax.swing.JButton();
        txPrevisaoAries2 = new javax.swing.JScrollPane();
        txtPrevisaoGemeos = new javax.swing.JTextArea();
        areaEnergiaGemeos = new javax.swing.JPanel();
        tituloEnergiaGemeos = new javax.swing.JLabel();
        amorGemeos = new javax.swing.JLabel();
        trabalhoGemeos = new javax.swing.JLabel();
        saudeGemeos = new javax.swing.JLabel();
        sorteGemeos = new javax.swing.JLabel();
        tfAmorGemeos = new javax.swing.JTextField();
        tfTrabalhoGemeos = new javax.swing.JTextField();
        tfSaudeGemeos = new javax.swing.JTextField();
        tfSorteGemeos = new javax.swing.JTextField();
        areaMensagemGemeos = new javax.swing.JPanel();
        tituloMensagemGemeos = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        txMensagemGemeos = new javax.swing.JTextArea();
        btnCopiarMensagemGemeos = new javax.swing.JButton();
        fundoGemeos = new javax.swing.JLabel();
        cancer = new javax.swing.JPanel();
        areaInformacoesCancer = new javax.swing.JPanel();
        imgSignoCancer = new javax.swing.JLabel();
        tituloCancer = new javax.swing.JLabel();
        periodoCancer = new javax.swing.JLabel();
        elementoCancer = new javax.swing.JLabel();
        planetaCancer = new javax.swing.JLabel();
        corCancer = new javax.swing.JLabel();
        numeroCancer = new javax.swing.JLabel();
        tfPeriodoCancer = new javax.swing.JTextField();
        tfElementoCancer = new javax.swing.JTextField();
        tfPlanetaCancer = new javax.swing.JTextField();
        tfCorCancer = new javax.swing.JTextField();
        tfNumeroCancer = new javax.swing.JTextField();
        areaCaracteristicasCancer = new javax.swing.JPanel();
        tituloCarecteristicasCancer = new javax.swing.JLabel();
        pfortesCancer = new javax.swing.JLabel();
        pMelhorarCancer = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        txFortesCancer = new javax.swing.JTextArea();
        jScrollPane11 = new javax.swing.JScrollPane();
        txMelhorarCancer = new javax.swing.JTextArea();
        areaPrevisaoCancer = new javax.swing.JPanel();
        previsaoCancer = new javax.swing.JLabel();
        btnAtualizarPrevisaoCancer = new javax.swing.JButton();
        txPrevisaoAries3 = new javax.swing.JScrollPane();
        txtPrevisaoCancer = new javax.swing.JTextArea();
        areaEnergiaCancer = new javax.swing.JPanel();
        tituloEnergiaCancer = new javax.swing.JLabel();
        amorCancer = new javax.swing.JLabel();
        trabalhoCancer = new javax.swing.JLabel();
        saudeCancer = new javax.swing.JLabel();
        sorteCancer = new javax.swing.JLabel();
        tfAmorCancer = new javax.swing.JTextField();
        tfTrabalhoCancer = new javax.swing.JTextField();
        tfSaudeCancer = new javax.swing.JTextField();
        tfSorteCancer = new javax.swing.JTextField();
        areaMensagemCancer = new javax.swing.JPanel();
        tituloMensagemCancer = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        txMensagemCancer = new javax.swing.JTextArea();
        btnCopiarMensagemCancer = new javax.swing.JButton();
        fundoCancer = new javax.swing.JLabel();
        leao = new javax.swing.JPanel();
        areaInformacoesLeao = new javax.swing.JPanel();
        imgSignoLeao = new javax.swing.JLabel();
        tituloLeao = new javax.swing.JLabel();
        periodoLeao = new javax.swing.JLabel();
        elementoLeao = new javax.swing.JLabel();
        planetaLeao = new javax.swing.JLabel();
        corLeao = new javax.swing.JLabel();
        numeroLeao = new javax.swing.JLabel();
        tfPeriodoLeao = new javax.swing.JTextField();
        tfElementoLeao = new javax.swing.JTextField();
        tfPlanetaLeao = new javax.swing.JTextField();
        tfCorLeao = new javax.swing.JTextField();
        tfNumeroLeao = new javax.swing.JTextField();
        areaCaracteristicasLeao = new javax.swing.JPanel();
        tituloCarecteristicasLeao = new javax.swing.JLabel();
        pfortesLeao = new javax.swing.JLabel();
        pMelhorarLeao = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        txFortesLeao = new javax.swing.JTextArea();
        jScrollPane14 = new javax.swing.JScrollPane();
        txMelhorarLeao = new javax.swing.JTextArea();
        areaPrevisaoLeao = new javax.swing.JPanel();
        previsaoLeao = new javax.swing.JLabel();
        btnAtualizarPrevisaoLeao = new javax.swing.JButton();
        txPrevisaoAries4 = new javax.swing.JScrollPane();
        txtPrevisaoLeao = new javax.swing.JTextArea();
        areaEnergiaLeao = new javax.swing.JPanel();
        tituloEnergiaLeao = new javax.swing.JLabel();
        amorLeao = new javax.swing.JLabel();
        trabalhoLeao = new javax.swing.JLabel();
        saudeLeao = new javax.swing.JLabel();
        sorteLeao = new javax.swing.JLabel();
        tfAmorLeao = new javax.swing.JTextField();
        tfTrabalhoLeao = new javax.swing.JTextField();
        tfSaudeLeao = new javax.swing.JTextField();
        tfSorteLeao = new javax.swing.JTextField();
        areaMensagemLeao = new javax.swing.JPanel();
        tituloMensagemLeao = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        txMensagemLeao = new javax.swing.JTextArea();
        btnCopiarMensagemLeao = new javax.swing.JButton();
        fundoLeao = new javax.swing.JLabel();
        virgem = new javax.swing.JPanel();
        areaInformacoesVirgem = new javax.swing.JPanel();
        imgSignoVirgem = new javax.swing.JLabel();
        tituloVirgem = new javax.swing.JLabel();
        periodoVirgem = new javax.swing.JLabel();
        elementoVirgem = new javax.swing.JLabel();
        planetaVirgem = new javax.swing.JLabel();
        corVirgem = new javax.swing.JLabel();
        numeroVirgem = new javax.swing.JLabel();
        tfPeriodoVirgem = new javax.swing.JTextField();
        tfElementoVirgem = new javax.swing.JTextField();
        tfPlanetaVirgem = new javax.swing.JTextField();
        tfCorVirgem = new javax.swing.JTextField();
        tfNumeroVirgem = new javax.swing.JTextField();
        areaCaracteristicasVirgem = new javax.swing.JPanel();
        tituloCarecteristicasVirgem = new javax.swing.JLabel();
        pfortesVirgem = new javax.swing.JLabel();
        pMelhorarVirgem = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        txFortesVirgem = new javax.swing.JTextArea();
        jScrollPane17 = new javax.swing.JScrollPane();
        txMelhorarVirgem = new javax.swing.JTextArea();
        areaPrevisaoVirgem = new javax.swing.JPanel();
        previsaoVirgem = new javax.swing.JLabel();
        btnAtualizarPrevisaoVirgem = new javax.swing.JButton();
        txPrevisaoAries5 = new javax.swing.JScrollPane();
        txtPrevisaoVirgem = new javax.swing.JTextArea();
        areaEnergiaVirgem = new javax.swing.JPanel();
        tituloEnergiaVirgem = new javax.swing.JLabel();
        amorVirgem = new javax.swing.JLabel();
        trabalhoVirgem = new javax.swing.JLabel();
        saudeVirgem = new javax.swing.JLabel();
        sorteVirgem = new javax.swing.JLabel();
        tfAmorVirgem = new javax.swing.JTextField();
        tfTrabalhoVirgem = new javax.swing.JTextField();
        tfSaudeVirgem = new javax.swing.JTextField();
        tfSorteVirgem = new javax.swing.JTextField();
        areaMensagemVirgem = new javax.swing.JPanel();
        tituloMensagemVirgem = new javax.swing.JLabel();
        jScrollPane18 = new javax.swing.JScrollPane();
        txMensagemVirgem = new javax.swing.JTextArea();
        btnCopiarMensagemVirgem = new javax.swing.JButton();
        fundoVirgem = new javax.swing.JLabel();
        libra = new javax.swing.JPanel();
        areaInformacoesLibra = new javax.swing.JPanel();
        imgSignoLibra = new javax.swing.JLabel();
        tituloLibra = new javax.swing.JLabel();
        periodoLibra = new javax.swing.JLabel();
        elementoLibra = new javax.swing.JLabel();
        planetaLibra = new javax.swing.JLabel();
        corLibra = new javax.swing.JLabel();
        numeroLibra = new javax.swing.JLabel();
        tfPeriodoLibra = new javax.swing.JTextField();
        tfElementoLibra = new javax.swing.JTextField();
        tfPlanetaLibra = new javax.swing.JTextField();
        tfCorLibra = new javax.swing.JTextField();
        tfNumeroLibra = new javax.swing.JTextField();
        areaCaracteristicasLibra = new javax.swing.JPanel();
        tituloCarecteristicasLibra = new javax.swing.JLabel();
        pfortesLibra = new javax.swing.JLabel();
        pMelhorarLibra = new javax.swing.JLabel();
        jScrollPane19 = new javax.swing.JScrollPane();
        txFortesLibra = new javax.swing.JTextArea();
        jScrollPane20 = new javax.swing.JScrollPane();
        txMelhorarLibra = new javax.swing.JTextArea();
        areaPrevisaoLibra = new javax.swing.JPanel();
        previsaoLibra = new javax.swing.JLabel();
        btnAtualizarPrevisaoLibra = new javax.swing.JButton();
        txPrevisaoAries6 = new javax.swing.JScrollPane();
        txtPrevisaoLibra = new javax.swing.JTextArea();
        areaEnergiaLibra = new javax.swing.JPanel();
        tituloEnergiaLibra = new javax.swing.JLabel();
        amorLibra = new javax.swing.JLabel();
        trabalhoLibra = new javax.swing.JLabel();
        saudeLibra = new javax.swing.JLabel();
        sorteLibra = new javax.swing.JLabel();
        tfAmorLibra = new javax.swing.JTextField();
        tfTrabalhoLibra = new javax.swing.JTextField();
        tfSaudeLibra = new javax.swing.JTextField();
        tfSorteLibra = new javax.swing.JTextField();
        areaMensagemLibra = new javax.swing.JPanel();
        tituloMensagemLibra = new javax.swing.JLabel();
        jScrollPane21 = new javax.swing.JScrollPane();
        txMensagemLibra = new javax.swing.JTextArea();
        btnCopiarMensagemLibra = new javax.swing.JButton();
        fundoLibra = new javax.swing.JLabel();
        escorpião = new javax.swing.JPanel();
        areaInformacoesEscorpiao = new javax.swing.JPanel();
        imgSignoEscorpiao = new javax.swing.JLabel();
        tituloEscorpiao = new javax.swing.JLabel();
        periodoEscorpiao = new javax.swing.JLabel();
        elementoEscorpiao = new javax.swing.JLabel();
        planetaEscorpiao = new javax.swing.JLabel();
        corEscorpiao = new javax.swing.JLabel();
        numeroEscorpiao = new javax.swing.JLabel();
        tfPeriodoEscorpiao = new javax.swing.JTextField();
        tfElementoEscorpiao = new javax.swing.JTextField();
        tfPlanetaEscorpiao = new javax.swing.JTextField();
        tfCorEscorpiao = new javax.swing.JTextField();
        tfNumeroEscorpiao = new javax.swing.JTextField();
        areaCaracteristicasEscorpiao = new javax.swing.JPanel();
        tituloCarecteristicasEscorpiao = new javax.swing.JLabel();
        pfortesEscorpiao = new javax.swing.JLabel();
        pMelhorarEscorpiao = new javax.swing.JLabel();
        jScrollPane22 = new javax.swing.JScrollPane();
        txFortesEscorpiao = new javax.swing.JTextArea();
        jScrollPane23 = new javax.swing.JScrollPane();
        txMelhorarEscorpiao = new javax.swing.JTextArea();
        areaPrevisaoEscorpiao = new javax.swing.JPanel();
        previsaoEscorpiao = new javax.swing.JLabel();
        btnAtualizarPrevisaoEscorpiao = new javax.swing.JButton();
        txPrevisaoAries7 = new javax.swing.JScrollPane();
        txtPrevisaoEscorpiao = new javax.swing.JTextArea();
        areaEnergiaEscorpiao = new javax.swing.JPanel();
        tituloEnergiaEscorpiao = new javax.swing.JLabel();
        amorEscorpiao = new javax.swing.JLabel();
        trabalhoEscorpiao = new javax.swing.JLabel();
        saudeEscorpiao = new javax.swing.JLabel();
        sorteEscorpiao = new javax.swing.JLabel();
        tfAmorEscorpiao = new javax.swing.JTextField();
        tfTrabalhoEscorpiao = new javax.swing.JTextField();
        tfSaudeEscorpiao = new javax.swing.JTextField();
        tfSorteEscorpiao = new javax.swing.JTextField();
        areaMensagemEscorpiao = new javax.swing.JPanel();
        tituloMensagemEscorpiao = new javax.swing.JLabel();
        jScrollPane24 = new javax.swing.JScrollPane();
        txMensagemEscorpiao = new javax.swing.JTextArea();
        btnCopiarMensagemEscorpiao = new javax.swing.JButton();
        fundoEscorpiao = new javax.swing.JLabel();
        sagitario = new javax.swing.JPanel();
        areaInformacoesSagitario = new javax.swing.JPanel();
        imgSignoSagitario = new javax.swing.JLabel();
        tituloSagitario = new javax.swing.JLabel();
        periodoSagitario = new javax.swing.JLabel();
        elementoSagitario = new javax.swing.JLabel();
        planetaSagitario = new javax.swing.JLabel();
        corSagitario = new javax.swing.JLabel();
        numeroSagitario = new javax.swing.JLabel();
        tfPeriodoSagitario = new javax.swing.JTextField();
        tfElementoSagitario = new javax.swing.JTextField();
        tfPlanetaSagitario = new javax.swing.JTextField();
        tfCorSagitario = new javax.swing.JTextField();
        tfNumeroSagitario = new javax.swing.JTextField();
        areaCaracteristicasSagitario = new javax.swing.JPanel();
        tituloCarecteristicasSagitario = new javax.swing.JLabel();
        pfortesSagitario = new javax.swing.JLabel();
        pMelhorarSagitario = new javax.swing.JLabel();
        jScrollPane25 = new javax.swing.JScrollPane();
        txFortesSagitario = new javax.swing.JTextArea();
        jScrollPane26 = new javax.swing.JScrollPane();
        txMelhorarSagitario = new javax.swing.JTextArea();
        areaPrevisaoSagitario = new javax.swing.JPanel();
        previsaoSagitario = new javax.swing.JLabel();
        btnAtualizarPrevisaoSagitario = new javax.swing.JButton();
        txPrevisaoAries8 = new javax.swing.JScrollPane();
        txtPrevisaoSagitario = new javax.swing.JTextArea();
        areaEnergiaSagitario = new javax.swing.JPanel();
        tituloEnergiaSagitario = new javax.swing.JLabel();
        amorSagitario = new javax.swing.JLabel();
        trabalhoSagitario = new javax.swing.JLabel();
        saudeSagitario = new javax.swing.JLabel();
        sorteSagitario = new javax.swing.JLabel();
        tfAmorSagitario = new javax.swing.JTextField();
        tfTrabalhoSagitario = new javax.swing.JTextField();
        tfSaudeSagitario = new javax.swing.JTextField();
        tfSorteSagitario = new javax.swing.JTextField();
        areaMensagemSagitario = new javax.swing.JPanel();
        tituloMensagemSagitario = new javax.swing.JLabel();
        jScrollPane27 = new javax.swing.JScrollPane();
        txMensagemSagitario = new javax.swing.JTextArea();
        btnCopiarMensagemSagitario = new javax.swing.JButton();
        fundoSagitario = new javax.swing.JLabel();
        capricornio = new javax.swing.JPanel();
        areaInformacoesCapricornio = new javax.swing.JPanel();
        imgSignoCapricornio = new javax.swing.JLabel();
        tituloCapricornio = new javax.swing.JLabel();
        periodoCapricornio = new javax.swing.JLabel();
        elementoCapricornio = new javax.swing.JLabel();
        planetaCapricornio = new javax.swing.JLabel();
        corCapricornio = new javax.swing.JLabel();
        numeroCapricornio = new javax.swing.JLabel();
        tfPeriodoCapricornio = new javax.swing.JTextField();
        tfElementoCapricornio = new javax.swing.JTextField();
        tfPlanetaCapricornio = new javax.swing.JTextField();
        tfCorCapricornio = new javax.swing.JTextField();
        tfNumeroCapricornio = new javax.swing.JTextField();
        areaCaracteristicasCapricornio = new javax.swing.JPanel();
        tituloCarecteristicasCapricornio = new javax.swing.JLabel();
        pfortesCapricornio = new javax.swing.JLabel();
        pMelhorarCapricornio = new javax.swing.JLabel();
        jScrollPane28 = new javax.swing.JScrollPane();
        txFortesCapricornio = new javax.swing.JTextArea();
        jScrollPane29 = new javax.swing.JScrollPane();
        txMelhorarCapricornio = new javax.swing.JTextArea();
        areaPrevisaoCapricornio = new javax.swing.JPanel();
        previsaoCapricornio = new javax.swing.JLabel();
        btnAtualizarPrevisaoCapricornio = new javax.swing.JButton();
        txPrevisaoAries9 = new javax.swing.JScrollPane();
        txtPrevisaoCapricornio = new javax.swing.JTextArea();
        areaEnergiaCapricornio = new javax.swing.JPanel();
        tituloEnergiaCapricornio = new javax.swing.JLabel();
        amorCapricornio = new javax.swing.JLabel();
        trabalhoCapricornio = new javax.swing.JLabel();
        saudeCapricornio = new javax.swing.JLabel();
        sorteCapricornio = new javax.swing.JLabel();
        tfAmorCapricornio = new javax.swing.JTextField();
        tfTrabalhoCapricornio = new javax.swing.JTextField();
        tfSaudeCapricornio = new javax.swing.JTextField();
        tfSorteCapricornio = new javax.swing.JTextField();
        areaMensagemCapricornio = new javax.swing.JPanel();
        tituloMensagemCapricornio = new javax.swing.JLabel();
        jScrollPane30 = new javax.swing.JScrollPane();
        txMensagemCapricornio = new javax.swing.JTextArea();
        btnCopiarMensagemCapricornio = new javax.swing.JButton();
        fundoCapricornio = new javax.swing.JLabel();
        aquario = new javax.swing.JPanel();
        areaInformacoesAquario = new javax.swing.JPanel();
        imgSignoAquario = new javax.swing.JLabel();
        tituloAquario = new javax.swing.JLabel();
        periodoAquario = new javax.swing.JLabel();
        elementoAquario = new javax.swing.JLabel();
        planetaAquario = new javax.swing.JLabel();
        corAquario = new javax.swing.JLabel();
        numeroAquario = new javax.swing.JLabel();
        tfPeriodoAquario = new javax.swing.JTextField();
        tfElementoAquario = new javax.swing.JTextField();
        tfPlanetaAquario = new javax.swing.JTextField();
        tfCorAquario = new javax.swing.JTextField();
        tfNumeroAquario = new javax.swing.JTextField();
        areaCaracteristicasAquario = new javax.swing.JPanel();
        tituloCarecteristicasAquario = new javax.swing.JLabel();
        pfortesAquario = new javax.swing.JLabel();
        pMelhorarAquario = new javax.swing.JLabel();
        jScrollPane31 = new javax.swing.JScrollPane();
        txFortesAquario = new javax.swing.JTextArea();
        jScrollPane32 = new javax.swing.JScrollPane();
        txMelhorarAquario = new javax.swing.JTextArea();
        areaPrevisaoAquario = new javax.swing.JPanel();
        previsaoAquario = new javax.swing.JLabel();
        btnAtualizarPrevsaoAquario = new javax.swing.JButton();
        txPrevisaoAries10 = new javax.swing.JScrollPane();
        txtPrevisaoAquarios = new javax.swing.JTextArea();
        areaEnergiaAquario = new javax.swing.JPanel();
        tituloEnergiaAquario = new javax.swing.JLabel();
        amorAquario = new javax.swing.JLabel();
        trabalhoAquario = new javax.swing.JLabel();
        saudeAquario = new javax.swing.JLabel();
        sorteAquario = new javax.swing.JLabel();
        tfAmorAquario = new javax.swing.JTextField();
        tfTrabalhoAquario = new javax.swing.JTextField();
        tfSaudeAquario = new javax.swing.JTextField();
        tfSorteAquario = new javax.swing.JTextField();
        areaMensagemAquario = new javax.swing.JPanel();
        tituloMensagemAquario = new javax.swing.JLabel();
        jScrollPane33 = new javax.swing.JScrollPane();
        txMensagemAquario = new javax.swing.JTextArea();
        btnCopiarMensagemAquario = new javax.swing.JButton();
        fundoAquario = new javax.swing.JLabel();
        peixes = new javax.swing.JPanel();
        areaInformacoesPeixes = new javax.swing.JPanel();
        imgSignoPeixes = new javax.swing.JLabel();
        tituloPeixes = new javax.swing.JLabel();
        periodoPeixes = new javax.swing.JLabel();
        elementoPeixes = new javax.swing.JLabel();
        planetaPeixes = new javax.swing.JLabel();
        corPeixes = new javax.swing.JLabel();
        numeroPeixes = new javax.swing.JLabel();
        tfPeriodoPeixes = new javax.swing.JTextField();
        tfElementoPeixes = new javax.swing.JTextField();
        tfPlanetaPeixes = new javax.swing.JTextField();
        tfCorPeixes = new javax.swing.JTextField();
        tfNumeroPeixes = new javax.swing.JTextField();
        areaCaracteristicasPeixes = new javax.swing.JPanel();
        tituloCarecteristicasPeixes = new javax.swing.JLabel();
        pfortesPeixes = new javax.swing.JLabel();
        pMelhorarPeixes = new javax.swing.JLabel();
        jScrollPane34 = new javax.swing.JScrollPane();
        txFortesPeixes = new javax.swing.JTextArea();
        jScrollPane35 = new javax.swing.JScrollPane();
        txMelhorarPeixes = new javax.swing.JTextArea();
        areaPrevisaoPeixes = new javax.swing.JPanel();
        previsaoPeixes = new javax.swing.JLabel();
        btnAtualizarPrevsaoPeixes = new javax.swing.JButton();
        txPrevisaoAries11 = new javax.swing.JScrollPane();
        txtPrevisaoPeixes = new javax.swing.JTextArea();
        areaEnergiaPeixes = new javax.swing.JPanel();
        tituloEnergiaPeixes = new javax.swing.JLabel();
        amorPeixes = new javax.swing.JLabel();
        trabalhoPeixes = new javax.swing.JLabel();
        saudePeixes = new javax.swing.JLabel();
        sortePeixes = new javax.swing.JLabel();
        tfAmorPeixes = new javax.swing.JTextField();
        tfTrabalhoPeixes = new javax.swing.JTextField();
        tfSaudePeixes = new javax.swing.JTextField();
        tfSortePeixes = new javax.swing.JTextField();
        areaMensagemPeixes = new javax.swing.JPanel();
        tituloMensagemPeixes = new javax.swing.JLabel();
        jScrollPane36 = new javax.swing.JScrollPane();
        txMensagemPeixes = new javax.swing.JTextArea();
        btnCopiarMensagemPeixes = new javax.swing.JButton();
        fundoPeixes = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txPrevisaoAquario.setBackground(new java.awt.Color(242, 242, 209));
        txPrevisaoAquario.setForeground(new java.awt.Color(87, 4, 4));
        txPrevisaoAquario.setAlignmentX(10
        );
        txPrevisaoAquario.setAlignmentY(10
        );
        txPrevisaoAquario.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        txPrevisaoAquario.setPreferredSize(new java.awt.Dimension(2000, 0));

        inicio.setForeground(new java.awt.Color(123, 11, 11));
        inicio.setToolTipText("");
        inicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaCompatibilidade.setBackground(new java.awt.Color(87, 4, 4));
        areaCompatibilidade.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        areaCompatibilidade.setPreferredSize(new java.awt.Dimension(400, 290));

        tituloCompatibilidade.setFont(new java.awt.Font("Viner Hand ITC", 1, 20)); // NOI18N
        tituloCompatibilidade.setForeground(new java.awt.Color(255, 255, 255));
        tituloCompatibilidade.setText("Compatibiladade");

        signo1.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        signo1.setForeground(new java.awt.Color(255, 255, 255));
        signo1.setText("Primeiro Signo:");

        jLabel3.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Segundo Signo:");

        cbSigno1.setBackground(new java.awt.Color(255, 255, 204));
        cbSigno1.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        cbSigno1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Áries", "Touro", "Gêmeos", "Câncer", "Leão", "Virgem", "Libra", "Escorpiaõ", "Sagitário", "Capricórnio", "Aquário", "Peixes" }));

        cbSigno2.setBackground(new java.awt.Color(255, 255, 204));
        cbSigno2.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        cbSigno2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Áries", "Touro", "Gêmeos", "Câncer", "Leão", "Virgem", "Libra", "Escorpiaõ", "Sagitário", "Capricórnio", "Aquário", "Peixes" }));
        cbSigno2.addActionListener(this::cbSigno2ActionPerformed);

        btnCalcular.setBackground(new java.awt.Color(255, 255, 204));
        btnCalcular.setFont(new java.awt.Font("OCR A Extended", 1, 12)); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 3, new java.awt.Color(51, 51, 51)));
        btnCalcular.addActionListener(this::btnCalcularActionPerformed);

        javax.swing.GroupLayout areaCompatibilidadeLayout = new javax.swing.GroupLayout(areaCompatibilidade);
        areaCompatibilidade.setLayout(areaCompatibilidadeLayout);
        areaCompatibilidadeLayout.setHorizontalGroup(
            areaCompatibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCompatibilidadeLayout.createSequentialGroup()
                .addGroup(areaCompatibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaCompatibilidadeLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(areaCompatibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(signo1))
                        .addGap(62, 62, 62)
                        .addGroup(areaCompatibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbSigno1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbSigno2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(areaCompatibilidadeLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaCompatibilidadeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tituloCompatibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );
        areaCompatibilidadeLayout.setVerticalGroup(
            areaCompatibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCompatibilidadeLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(tituloCompatibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(areaCompatibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signo1)
                    .addComponent(cbSigno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(areaCompatibilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSigno2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        inicio.add(areaCompatibilidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 540, -1, 300));

        areaDescobrirSigno.setBackground(new java.awt.Color(87, 4, 4));
        areaDescobrirSigno.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        areaDescobrirSigno.setForeground(new java.awt.Color(255, 255, 255));
        areaDescobrirSigno.setPreferredSize(new java.awt.Dimension(400, 290));

        tituloDescobrirSigno.setFont(new java.awt.Font("Viner Hand ITC", 1, 20)); // NOI18N
        tituloDescobrirSigno.setForeground(new java.awt.Color(255, 255, 255));
        tituloDescobrirSigno.setText("Descubra Seu Signo");

        jLabel1.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome:");

        diaNascimento.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        diaNascimento.setForeground(new java.awt.Color(255, 255, 255));
        diaNascimento.setText("Dia de Nascimento:");

        mesNascimento.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        mesNascimento.setForeground(new java.awt.Color(255, 255, 255));
        mesNascimento.setText("Mês de Nascimento:");

        tfNome.setBackground(new java.awt.Color(255, 255, 204));
        tfNome.setForeground(new java.awt.Color(102, 102, 102));
        tfNome.setText("Digite seu nome.....");

        cbDia.setBackground(new java.awt.Color(255, 255, 204));
        cbDia.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        cbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cbDia.addActionListener(this::cbDiaActionPerformed);

        cbMes.setBackground(new java.awt.Color(255, 255, 204));
        cbMes.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        cbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));
        cbMes.addActionListener(this::cbMesActionPerformed);

        btnDescobrirSigno.setBackground(new java.awt.Color(255, 255, 204));
        btnDescobrirSigno.setFont(new java.awt.Font("OCR A Extended", 1, 12)); // NOI18N
        btnDescobrirSigno.setText("Descobrir Signo");
        btnDescobrirSigno.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 3, new java.awt.Color(0, 0, 0)));
        btnDescobrirSigno.addActionListener(this::btnDescobrirSignoActionPerformed);

        javax.swing.GroupLayout areaDescobrirSignoLayout = new javax.swing.GroupLayout(areaDescobrirSigno);
        areaDescobrirSigno.setLayout(areaDescobrirSignoLayout);
        areaDescobrirSignoLayout.setHorizontalGroup(
            areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(diaNascimento)
                    .addComponent(mesNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbMes, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbDia, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaDescobrirSignoLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaDescobrirSignoLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tituloDescobrirSigno, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaDescobrirSignoLayout.createSequentialGroup()
                        .addComponent(btnDescobrirSigno, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123))))
        );
        areaDescobrirSignoLayout.setVerticalGroup(
            areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaDescobrirSignoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(tituloDescobrirSigno, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diaNascimento)
                    .addComponent(cbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(areaDescobrirSignoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mesNascimento)
                    .addComponent(cbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnDescobrirSigno, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        inicio.add(areaDescobrirSigno, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, 290));

        areaResultado.setBackground(new java.awt.Color(87, 4, 4));
        areaResultado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        signo.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        signo.setForeground(new java.awt.Color(255, 255, 255));
        signo.setText("Signo");

        compatibilidade.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        compatibilidade.setForeground(new java.awt.Color(255, 255, 255));
        compatibilidade.setText("Compatibilidade");

        btnSigno.setBackground(new java.awt.Color(255, 255, 204));

        tfCompatibilidade.setBackground(new java.awt.Color(255, 255, 204));
        tfCompatibilidade.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnPlay.setBackground(new java.awt.Color(255, 255, 204));
        btnPlay.setFont(new java.awt.Font("OCR A Extended", 1, 12)); // NOI18N
        btnPlay.setText("Play");
        btnPlay.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPlay.setPreferredSize(new java.awt.Dimension(76, 32));
        btnPlay.addActionListener(this::btnPlayActionPerformed);

        btnPause.setBackground(new java.awt.Color(255, 255, 204));
        btnPause.setFont(new java.awt.Font("OCR A Extended", 1, 12)); // NOI18N
        btnPause.setForeground(new java.awt.Color(0, 0, 0));
        btnPause.setText("Pause");
        btnPause.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPause.setPreferredSize(new java.awt.Dimension(76, 32));
        btnPause.addActionListener(this::btnPauseActionPerformed);

        javax.swing.GroupLayout areaResultadoLayout = new javax.swing.GroupLayout(areaResultado);
        areaResultado.setLayout(areaResultadoLayout);
        areaResultadoLayout.setHorizontalGroup(
            areaResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaResultadoLayout.createSequentialGroup()
                .addGroup(areaResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaResultadoLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(signo))
                    .addGroup(areaResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaResultadoLayout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addComponent(compatibilidade))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, areaResultadoLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(areaResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfCompatibilidade, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaResultadoLayout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(btnPause, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(areaResultadoLayout.createSequentialGroup()
                                    .addGroup(areaResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnPlay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnSigno, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 0, Short.MAX_VALUE))))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        areaResultadoLayout.setVerticalGroup(
            areaResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaResultadoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(signo)
                .addGap(18, 18, 18)
                .addComponent(btnSigno, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(compatibilidade)
                .addGap(18, 18, 18)
                .addComponent(tfCompatibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnPlay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(btnPause, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        inicio.add(areaResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 160, 210, 590));

        fundoInicio.setBackground(new java.awt.Color(87, 4, 4));
        fundoInicio.setForeground(new java.awt.Color(102, 102, 102));
        fundoInicio.setIcon(new javax.swing.ImageIcon("C:\\Users\\CleicianeGomes\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\all5.png")); // NOI18N
        fundoInicio.setText("digite seu nome");
        inicio.add(fundoInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(-230, -10, 1670, 940));

        txPrevisaoAquario.addTab("Inicio", inicio);

        aries.setMaximumSize(new java.awt.Dimension(32767, 1200));
        aries.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaEnergia.setBackground(new java.awt.Color(87, 4, 4));
        areaEnergia.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tituloEnergiaAries.setFont(new java.awt.Font("Viner Hand ITC", 1, 20)); // NOI18N
        tituloEnergiaAries.setForeground(new java.awt.Color(255, 255, 255));
        tituloEnergiaAries.setText("Energia do Dia");

        amorAries.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        amorAries.setForeground(new java.awt.Color(255, 255, 255));
        amorAries.setText("Amor:");

        trabalhoAries.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        trabalhoAries.setForeground(new java.awt.Color(255, 255, 255));
        trabalhoAries.setText("Trabalho:");

        saudeAries.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        saudeAries.setForeground(new java.awt.Color(255, 255, 255));
        saudeAries.setText("Saúde:");

        sorteAries.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        sorteAries.setForeground(new java.awt.Color(255, 255, 255));
        sorteAries.setText("Sorte:");

        tfAmorAries.setText("85%");
        tfAmorAries.addActionListener(this::tfAmorAriesActionPerformed);

        tfTrabalhoAries.setText("90%");
        tfTrabalhoAries.setPreferredSize(new java.awt.Dimension(165, 26));

        tfSaudeAries.setText("75%");
        tfSaudeAries.setPreferredSize(new java.awt.Dimension(165, 26));
        tfSaudeAries.addActionListener(this::tfSaudeAriesActionPerformed);

        tfSorteAries.setText("80%");
        tfSorteAries.setPreferredSize(new java.awt.Dimension(265, 26));
        tfSorteAries.addActionListener(this::tfSorteAriesActionPerformed);

        javax.swing.GroupLayout areaEnergiaLayout = new javax.swing.GroupLayout(areaEnergia);
        areaEnergia.setLayout(areaEnergiaLayout);
        areaEnergiaLayout.setHorizontalGroup(
            areaEnergiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(areaEnergiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(trabalhoAries)
                    .addComponent(amorAries)
                    .addComponent(saudeAries)
                    .addComponent(sorteAries)
                    .addComponent(tfSaudeAries, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTrabalhoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSorteAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(areaEnergiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(tituloEnergiaAries, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfAmorAries, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        areaEnergiaLayout.setVerticalGroup(
            areaEnergiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(tituloEnergiaAries)
                .addGap(18, 18, 18)
                .addComponent(amorAries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(trabalhoAries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTrabalhoAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saudeAries)
                .addGap(1, 1, 1)
                .addComponent(tfSaudeAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sorteAries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSorteAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        aries.add(areaEnergia, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 30, 380, 300));

        areaInformacoes.setBackground(new java.awt.Color(87, 4, 4));
        areaInformacoes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        imgSignoAries.setIcon(new javax.swing.ImageIcon("C:\\Users\\CleicianeGomes\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\Aries.jpg")); // NOI18N

        tituloAries.setFont(new java.awt.Font("Viner Hand ITC", 1, 20)); // NOI18N
        tituloAries.setForeground(new java.awt.Color(255, 255, 255));
        tituloAries.setText("Áries");

        periodoAries.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        periodoAries.setForeground(new java.awt.Color(255, 255, 255));
        periodoAries.setText("Periodo:");

        elementoAries.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        elementoAries.setForeground(new java.awt.Color(255, 255, 255));
        elementoAries.setText("Elemento:");

        planetaAries.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        planetaAries.setForeground(new java.awt.Color(255, 255, 255));
        planetaAries.setText("Planeta Regente:");

        corAries.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        corAries.setForeground(new java.awt.Color(255, 255, 255));
        corAries.setText("Cor:");

        numeroAries.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        numeroAries.setForeground(new java.awt.Color(255, 255, 255));
        numeroAries.setText("Número da sorte:");

        tfPeriodoAries.setBackground(new java.awt.Color(255, 255, 204));
        tfPeriodoAries.setText("21/03 a 19/04");

        tfElementoAries.setBackground(new java.awt.Color(255, 255, 204));
        tfElementoAries.setText("Fogo");
        tfElementoAries.addActionListener(this::tfElementoAriesActionPerformed);

        tfPlanetaAries.setBackground(new java.awt.Color(255, 255, 204));
        tfPlanetaAries.setText("Marte");

        tfCorAries.setBackground(new java.awt.Color(255, 255, 204));
        tfCorAries.setText("Vermelho");

        tfNumeroAries.setBackground(new java.awt.Color(255, 255, 204));
        tfNumeroAries.setText("9");

        javax.swing.GroupLayout areaInformacoesLayout = new javax.swing.GroupLayout(areaInformacoes);
        areaInformacoes.setLayout(areaInformacoesLayout);
        areaInformacoesLayout.setHorizontalGroup(
            areaInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesLayout.createSequentialGroup()
                .addGroup(areaInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgSignoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(areaInformacoesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(areaInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoesLayout.createSequentialGroup()
                                .addGroup(areaInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(periodoAries)
                                    .addComponent(elementoAries))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(areaInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfPeriodoAries)
                                    .addComponent(tfElementoAries)))
                            .addGroup(areaInformacoesLayout.createSequentialGroup()
                                .addGroup(areaInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(areaInformacoesLayout.createSequentialGroup()
                                        .addComponent(corAries, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfCorAries, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tituloAries, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(areaInformacoesLayout.createSequentialGroup()
                                        .addComponent(planetaAries)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfPlanetaAries, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(areaInformacoesLayout.createSequentialGroup()
                                        .addComponent(numeroAries)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfNumeroAries, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        areaInformacoesLayout.setVerticalGroup(
            areaInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesLayout.createSequentialGroup()
                .addComponent(imgSignoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tituloAries)
                .addGroup(areaInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoesLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(areaInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfElementoAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(elementoAries)))
                    .addGroup(areaInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfPeriodoAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(periodoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(areaInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaAries)
                    .addComponent(tfPlanetaAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(areaInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corAries)
                    .addComponent(tfCorAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroAries)
                    .addComponent(tfNumeroAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        aries.add(areaInformacoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 310, 760));

        areaCaracteristicasAries.setBackground(new java.awt.Color(87, 4, 4));
        areaCaracteristicasAries.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tituloCarecteristicasAries.setFont(new java.awt.Font("Viner Hand ITC", 1, 20)); // NOI18N
        tituloCarecteristicasAries.setForeground(new java.awt.Color(255, 255, 255));
        tituloCarecteristicasAries.setText("Características");

        pfortesAries.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        pfortesAries.setForeground(new java.awt.Color(255, 255, 255));
        pfortesAries.setText("Pontos Fortes:");

        pMelhorarAries.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        pMelhorarAries.setForeground(new java.awt.Color(255, 255, 255));
        pMelhorarAries.setText("Pontos a Melhorar:");

        txFortesAries.setColumns(20);
        txFortesAries.setRows(5);
        txFortesAries.setText("Coragem, iniciativa, \ndeterminação e entusiasmo. \nGosta de novos desafios e \ncostuma agir com confiança.\n");
        jScrollPane2.setViewportView(txFortesAries);

        txMelhorarAries.setColumns(20);
        txMelhorarAries.setRows(5);
        txMelhorarAries.setText("Desenvolver a paciência, controlar a \nimpulsividade e ouvir mais as \nopiniões dos outros.");
        jScrollPane3.setViewportView(txMelhorarAries);

        javax.swing.GroupLayout areaCaracteristicasAriesLayout = new javax.swing.GroupLayout(areaCaracteristicasAries);
        areaCaracteristicasAries.setLayout(areaCaracteristicasAriesLayout);
        areaCaracteristicasAriesLayout.setHorizontalGroup(
            areaCaracteristicasAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasAriesLayout.createSequentialGroup()
                .addGroup(areaCaracteristicasAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaCaracteristicasAriesLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(areaCaracteristicasAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pfortesAries)
                            .addComponent(pMelhorarAries)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(areaCaracteristicasAriesLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(tituloCarecteristicasAries)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        areaCaracteristicasAriesLayout.setVerticalGroup(
            areaCaracteristicasAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasAriesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloCarecteristicasAries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pfortesAries)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pMelhorarAries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        aries.add(areaCaracteristicasAries, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 300, 350));

        areaPrevisaoAries.setBackground(new java.awt.Color(87, 4, 4));
        areaPrevisaoAries.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        previsaoAries.setFont(new java.awt.Font("Viner Hand ITC", 1, 20)); // NOI18N
        previsaoAries.setForeground(new java.awt.Color(255, 255, 255));
        previsaoAries.setText("Previsão do Dia:");

        btnAtualizarPrevisaoAries.setBackground(new java.awt.Color(255, 255, 204));
        btnAtualizarPrevisaoAries.setFont(new java.awt.Font("OCR A Extended", 1, 12)); // NOI18N
        btnAtualizarPrevisaoAries.setText("Atualizar Previsão");
        btnAtualizarPrevisaoAries.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAtualizarPrevisaoAries.setPreferredSize(new java.awt.Dimension(157, 32));
        btnAtualizarPrevisaoAries.addActionListener(this::btnAtualizarPrevisaoAriesActionPerformed);

        txtPrevisaoAries.setColumns(20);
        txtPrevisaoAries.setRows(5);
        txPrevisao.setViewportView(txtPrevisaoAries);

        javax.swing.GroupLayout areaPrevisaoAriesLayout = new javax.swing.GroupLayout(areaPrevisaoAries);
        areaPrevisaoAries.setLayout(areaPrevisaoAriesLayout);
        areaPrevisaoAriesLayout.setHorizontalGroup(
            areaPrevisaoAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoAriesLayout.createSequentialGroup()
                .addGroup(areaPrevisaoAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisaoAriesLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(btnAtualizarPrevisaoAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaPrevisaoAriesLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(previsaoAries, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaPrevisaoAriesLayout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(txPrevisao, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        areaPrevisaoAriesLayout.setVerticalGroup(
            areaPrevisaoAriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoAriesLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(previsaoAries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txPrevisao, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btnAtualizarPrevisaoAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        aries.add(areaPrevisaoAries, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, 300, 320));

        areaMensagem.setBackground(new java.awt.Color(87, 4, 4));
        areaMensagem.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tituloMensagemAries.setFont(new java.awt.Font("Viner Hand ITC", 1, 20)); // NOI18N
        tituloMensagemAries.setForeground(new java.awt.Color(255, 255, 255));
        tituloMensagemAries.setText("Mensagem do Dia:");

        txMensagemAries.setColumns(20);
        txMensagemAries.setRows(5);
        txMensagemAries.setText("\n");
        jScrollPane1.setViewportView(txMensagemAries);

        btnCopiarMensagemAries.setBackground(new java.awt.Color(255, 255, 204));
        btnCopiarMensagemAries.setFont(new java.awt.Font("OCR A Extended", 1, 12)); // NOI18N
        btnCopiarMensagemAries.setText("Copiar Mensagem");
        btnCopiarMensagemAries.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCopiarMensagemAries.setPreferredSize(new java.awt.Dimension(103, 32));

        javax.swing.GroupLayout areaMensagemLayout = new javax.swing.GroupLayout(areaMensagem);
        areaMensagem.setLayout(areaMensagemLayout);
        areaMensagemLayout.setHorizontalGroup(
            areaMensagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemLayout.createSequentialGroup()
                .addGroup(areaMensagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaMensagemLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(tituloMensagemAries))
                    .addGroup(areaMensagemLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(btnCopiarMensagemAries, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaMensagemLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        areaMensagemLayout.setVerticalGroup(
            areaMensagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(tituloMensagemAries)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMensagemAries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        aries.add(areaMensagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 420, 380, 280));

        fundoAries.setIcon(new javax.swing.ImageIcon("C:\\Users\\CleicianeGomes\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\all5.png")); // NOI18N
        aries.add(fundoAries, new org.netbeans.lib.awtextra.AbsoluteConstraints(-140, 0, 1390, -1));

        txPrevisaoAquario.addTab("Áries", aries);

        touro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaInformacaoTouro.setBackground(new java.awt.Color(87, 4, 4));
        areaInformacaoTouro.setPreferredSize(new java.awt.Dimension(300, 740));

        imgSignoTouro.setIcon(new javax.swing.ImageIcon("C:\\Users\\CleicianeGomes\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\touro.jpg")); // NOI18N

        tituloTouro.setFont(new java.awt.Font("Viner Hand ITC", 1, 20)); // NOI18N
        tituloTouro.setForeground(new java.awt.Color(255, 255, 255));
        tituloTouro.setText("Touro");

        periodoTouro.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        periodoTouro.setForeground(new java.awt.Color(255, 255, 255));
        periodoTouro.setText("Periodo:");

        elementoTouro.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        elementoTouro.setForeground(new java.awt.Color(255, 255, 255));
        elementoTouro.setText("Elemento:");

        planetaTouro.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        planetaTouro.setForeground(new java.awt.Color(255, 255, 255));
        planetaTouro.setText("Planeta Regente:");

        corTouro.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        corTouro.setForeground(new java.awt.Color(255, 255, 255));
        corTouro.setText("Cor:");

        numeroTouro.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        numeroTouro.setForeground(new java.awt.Color(255, 255, 255));
        numeroTouro.setText("Número da sorte:");

        tfPeriodoTouro.setText("20/04 a 20/05");

        tfElementoTouro.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        tfElementoTouro.setForeground(new java.awt.Color(0, 0, 0));
        tfElementoTouro.setText("Terra");

        tfPlanetaTouro.setText("Vênus");

        tfCorTouro.setText("Verde");

        tfNumeroTouro.setText("6");
        tfNumeroTouro.addActionListener(this::tfNumeroTouroActionPerformed);

        javax.swing.GroupLayout areaInformacaoTouroLayout = new javax.swing.GroupLayout(areaInformacaoTouro);
        areaInformacaoTouro.setLayout(areaInformacaoTouroLayout);
        areaInformacaoTouroLayout.setHorizontalGroup(
            areaInformacaoTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacaoTouroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaInformacaoTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgSignoTouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(areaInformacaoTouroLayout.createSequentialGroup()
                        .addGroup(areaInformacaoTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tituloTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(areaInformacaoTouroLayout.createSequentialGroup()
                                .addComponent(elementoTouro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfElementoTouro))
                            .addGroup(areaInformacaoTouroLayout.createSequentialGroup()
                                .addComponent(planetaTouro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPlanetaTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaInformacaoTouroLayout.createSequentialGroup()
                                .addComponent(corTouro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfCorTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaInformacaoTouroLayout.createSequentialGroup()
                                .addComponent(numeroTouro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNumeroTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(areaInformacaoTouroLayout.createSequentialGroup()
                                .addComponent(periodoTouro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPeriodoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        areaInformacaoTouroLayout.setVerticalGroup(
            areaInformacaoTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacaoTouroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgSignoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tituloTouro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(areaInformacaoTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodoTouro)
                    .addComponent(tfPeriodoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(areaInformacaoTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elementoTouro)
                    .addComponent(tfElementoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(areaInformacaoTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaTouro)
                    .addComponent(tfPlanetaTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(areaInformacaoTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corTouro)
                    .addComponent(tfCorTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(areaInformacaoTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroTouro)
                    .addComponent(tfNumeroTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        touro.add(areaInformacaoTouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 300, 740));

        areaCaracteristicasTouro.setBackground(new java.awt.Color(87, 4, 4));
        areaCaracteristicasTouro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tituloCarecteristicasAries1.setFont(new java.awt.Font("Viner Hand ITC", 1, 20)); // NOI18N
        tituloCarecteristicasAries1.setForeground(new java.awt.Color(255, 255, 255));
        tituloCarecteristicasAries1.setText("Características");

        pfortesTouro.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        pfortesTouro.setForeground(new java.awt.Color(255, 255, 255));
        pfortesTouro.setText("Pontos Fortes:");

        pMelhorarTouro.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        pMelhorarTouro.setForeground(new java.awt.Color(255, 255, 255));
        pMelhorarTouro.setText("Pontos a Melhorar:");

        txFortesTouro.setColumns(20);
        txFortesTouro.setRows(5);
        txFortesTouro.setText("Lealdade, determinação,\nestabilidade e responsabilidade. \nValoriza segurança e relações duradouras.");
        jScrollPane4.setViewportView(txFortesTouro);

        txMelhorarTouro.setColumns(20);
        txMelhorarTouro.setRows(5);
        txMelhorarTouro.setText("Evitar a teimosia, aceitar mudanças e \nser mais flexível diante de situações \ninesperadas.");
        jScrollPane5.setViewportView(txMelhorarTouro);

        javax.swing.GroupLayout areaCaracteristicasTouroLayout = new javax.swing.GroupLayout(areaCaracteristicasTouro);
        areaCaracteristicasTouro.setLayout(areaCaracteristicasTouroLayout);
        areaCaracteristicasTouroLayout.setHorizontalGroup(
            areaCaracteristicasTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasTouroLayout.createSequentialGroup()
                .addGroup(areaCaracteristicasTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaCaracteristicasTouroLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(areaCaracteristicasTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pfortesTouro)
                            .addComponent(pMelhorarTouro)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                            .addComponent(jScrollPane4)))
                    .addGroup(areaCaracteristicasTouroLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(tituloCarecteristicasAries1)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        areaCaracteristicasTouroLayout.setVerticalGroup(
            areaCaracteristicasTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasTouroLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloCarecteristicasAries1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pfortesTouro)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pMelhorarTouro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        touro.add(areaCaracteristicasTouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 320, 330));

        areaPrevisaoTouro.setBackground(new java.awt.Color(87, 4, 4));
        areaPrevisaoTouro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        previsaoTouro.setFont(new java.awt.Font("Viner Hand ITC", 1, 20)); // NOI18N
        previsaoTouro.setForeground(new java.awt.Color(255, 255, 255));
        previsaoTouro.setText("Previsão do Dia:");

        btnAtualizarPrevisaoTouro.setBackground(new java.awt.Color(255, 255, 204));
        btnAtualizarPrevisaoTouro.setFont(new java.awt.Font("OCR A Extended", 1, 12)); // NOI18N
        btnAtualizarPrevisaoTouro.setText("Atualizar Previsão");
        btnAtualizarPrevisaoTouro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAtualizarPrevisaoTouro.setPreferredSize(new java.awt.Dimension(157, 32));
        btnAtualizarPrevisaoTouro.addActionListener(this::btnAtualizarPrevisaoTouroActionPerformed);

        txtPrevisaoTouro.setColumns(20);
        txtPrevisaoTouro.setRows(5);
        txPrevisaoAries1.setViewportView(txtPrevisaoTouro);

        javax.swing.GroupLayout areaPrevisaoTouroLayout = new javax.swing.GroupLayout(areaPrevisaoTouro);
        areaPrevisaoTouro.setLayout(areaPrevisaoTouroLayout);
        areaPrevisaoTouroLayout.setHorizontalGroup(
            areaPrevisaoTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaPrevisaoTouroLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(previsaoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(areaPrevisaoTouroLayout.createSequentialGroup()
                .addGroup(areaPrevisaoTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisaoTouroLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(btnAtualizarPrevisaoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaPrevisaoTouroLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(txPrevisaoAries1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        areaPrevisaoTouroLayout.setVerticalGroup(
            areaPrevisaoTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoTouroLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(previsaoTouro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txPrevisaoAries1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnAtualizarPrevisaoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        touro.add(areaPrevisaoTouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 450, 320, 320));

        areaEnergiaTouro.setBackground(new java.awt.Color(87, 4, 4));
        areaEnergiaTouro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tituloEnergiaAries1.setFont(new java.awt.Font("Viner Hand ITC", 1, 20)); // NOI18N
        tituloEnergiaAries1.setForeground(new java.awt.Color(255, 255, 255));
        tituloEnergiaAries1.setText("Energia do Dia");

        amorTouro.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        amorTouro.setForeground(new java.awt.Color(255, 255, 255));
        amorTouro.setText("Amor:");

        trabalhoTouro.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        trabalhoTouro.setForeground(new java.awt.Color(255, 255, 255));
        trabalhoTouro.setText("Trabalho:");

        saudeTouro.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        saudeTouro.setForeground(new java.awt.Color(255, 255, 255));
        saudeTouro.setText("Saúde:");

        sorteTouro.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        sorteTouro.setForeground(new java.awt.Color(255, 255, 255));
        sorteTouro.setText("Sorte:");

        tfAmorTouro.setText("90%");

        tfTrabalhoTouro.setText("85%");
        tfTrabalhoTouro.setPreferredSize(new java.awt.Dimension(165, 26));
        tfTrabalhoTouro.addActionListener(this::tfTrabalhoTouroActionPerformed);

        tfSaudeTouro.setText("80%");
        tfSaudeTouro.setPreferredSize(new java.awt.Dimension(165, 26));

        tfSorteTouro.setText("75%");
        tfSorteTouro.setPreferredSize(new java.awt.Dimension(265, 26));
        tfSorteTouro.addActionListener(this::tfSorteTouroActionPerformed);

        javax.swing.GroupLayout areaEnergiaTouroLayout = new javax.swing.GroupLayout(areaEnergiaTouro);
        areaEnergiaTouro.setLayout(areaEnergiaTouroLayout);
        areaEnergiaTouroLayout.setHorizontalGroup(
            areaEnergiaTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaTouroLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(areaEnergiaTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(trabalhoTouro)
                    .addComponent(amorTouro)
                    .addComponent(saudeTouro)
                    .addComponent(sorteTouro)
                    .addComponent(tfSaudeTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTrabalhoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSorteTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(areaEnergiaTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(tituloEnergiaAries1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfAmorTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        areaEnergiaTouroLayout.setVerticalGroup(
            areaEnergiaTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaTouroLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(tituloEnergiaAries1)
                .addGap(18, 18, 18)
                .addComponent(amorTouro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(trabalhoTouro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTrabalhoTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saudeTouro)
                .addGap(1, 1, 1)
                .addComponent(tfSaudeTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sorteTouro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSorteTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        touro.add(areaEnergiaTouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 60, 380, 300));

        areaMensagemTouro.setBackground(new java.awt.Color(87, 4, 4));
        areaMensagemTouro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tituloMensagemTouro.setFont(new java.awt.Font("Viner Hand ITC", 1, 20)); // NOI18N
        tituloMensagemTouro.setForeground(new java.awt.Color(255, 255, 255));
        tituloMensagemTouro.setText("Mensagem do Dia:");

        txMensagemTouro.setColumns(20);
        txMensagemTouro.setRows(5);
        txMensagemTouro.setText("\n");
        jScrollPane6.setViewportView(txMensagemTouro);

        btnCopiarMensagemTouro.setBackground(new java.awt.Color(255, 255, 204));
        btnCopiarMensagemTouro.setFont(new java.awt.Font("OCR A Extended", 1, 12)); // NOI18N
        btnCopiarMensagemTouro.setText("Copiar Mensagem");
        btnCopiarMensagemTouro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCopiarMensagemTouro.setPreferredSize(new java.awt.Dimension(103, 32));

        javax.swing.GroupLayout areaMensagemTouroLayout = new javax.swing.GroupLayout(areaMensagemTouro);
        areaMensagemTouro.setLayout(areaMensagemTouroLayout);
        areaMensagemTouroLayout.setHorizontalGroup(
            areaMensagemTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemTouroLayout.createSequentialGroup()
                .addGroup(areaMensagemTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaMensagemTouroLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(tituloMensagemTouro))
                    .addGroup(areaMensagemTouroLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaMensagemTouroLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(btnCopiarMensagemTouro, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        areaMensagemTouroLayout.setVerticalGroup(
            areaMensagemTouroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemTouroLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(tituloMensagemTouro)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMensagemTouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        touro.add(areaMensagemTouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 470, 380, 280));

        fundoTouro.setIcon(new javax.swing.ImageIcon("C:\\Users\\CleicianeGomes\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\all5.png")); // NOI18N
        touro.add(fundoTouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(-150, -10, -1, -1));

        txPrevisaoAquario.addTab("Touro", touro);

        gemeos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaInformacoesGemeos.setBackground(new java.awt.Color(87, 4, 4));
        areaInformacoesGemeos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        imgSignoGemeos.setIcon(new javax.swing.ImageIcon("C:\\Users\\CleicianeGomes\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\gemeos.jpg")); // NOI18N

        tituloGemeos.setFont(new java.awt.Font("Viner Hand ITC", 1, 20)); // NOI18N
        tituloGemeos.setForeground(new java.awt.Color(255, 255, 255));
        tituloGemeos.setText("Gêmeos");

        periodoGemeos.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        periodoGemeos.setForeground(new java.awt.Color(255, 255, 255));
        periodoGemeos.setText("Periodo:");

        elementoGemeos.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        elementoGemeos.setForeground(new java.awt.Color(255, 255, 255));
        elementoGemeos.setText("Elemento:");

        planetaGemeos.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        planetaGemeos.setForeground(new java.awt.Color(255, 255, 255));
        planetaGemeos.setText("Planeta Regente:");

        corGemeos.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        corGemeos.setForeground(new java.awt.Color(255, 255, 255));
        corGemeos.setText("Cor:");

        numeroGemeos.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        numeroGemeos.setForeground(new java.awt.Color(255, 255, 255));
        numeroGemeos.setText("Número da sorte:");

        tfPeriodoGemeos.setBackground(new java.awt.Color(255, 255, 204));
        tfPeriodoGemeos.setText("21/05 a 20/06");

        tfElementoGemeos.setBackground(new java.awt.Color(255, 255, 204));
        tfElementoGemeos.setText("Ar");

        tfPlanetaGemeos.setBackground(new java.awt.Color(255, 255, 204));
        tfPlanetaGemeos.setText("Mercúrio");

        tfCorGemeos.setBackground(new java.awt.Color(255, 255, 204));
        tfCorGemeos.setText("Amarelo");

        tfNumeroGemeos.setBackground(new java.awt.Color(255, 255, 204));
        tfNumeroGemeos.setText("5");

        javax.swing.GroupLayout areaInformacoesGemeosLayout = new javax.swing.GroupLayout(areaInformacoesGemeos);
        areaInformacoesGemeos.setLayout(areaInformacoesGemeosLayout);
        areaInformacoesGemeosLayout.setHorizontalGroup(
            areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesGemeosLayout.createSequentialGroup()
                .addGroup(areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgSignoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(areaInformacoesGemeosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoesGemeosLayout.createSequentialGroup()
                                .addGroup(areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(periodoGemeos)
                                    .addComponent(elementoGemeos))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfPeriodoGemeos)
                                    .addComponent(tfElementoGemeos)))
                            .addGroup(areaInformacoesGemeosLayout.createSequentialGroup()
                                .addGroup(areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(areaInformacoesGemeosLayout.createSequentialGroup()
                                        .addComponent(corGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfCorGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tituloGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(areaInformacoesGemeosLayout.createSequentialGroup()
                                        .addComponent(planetaGemeos)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfPlanetaGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(areaInformacoesGemeosLayout.createSequentialGroup()
                                        .addComponent(numeroGemeos)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfNumeroGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 32, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        areaInformacoesGemeosLayout.setVerticalGroup(
            areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesGemeosLayout.createSequentialGroup()
                .addComponent(imgSignoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tituloGemeos)
                .addGroup(areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoesGemeosLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfElementoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(elementoGemeos)))
                    .addGroup(areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfPeriodoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(periodoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaGemeos)
                    .addComponent(tfPlanetaGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corGemeos)
                    .addComponent(tfCorGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroGemeos)
                    .addComponent(tfNumeroGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        gemeos.add(areaInformacoesGemeos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 310, 760));

        areaCaracteristicasGemeos.setBackground(new java.awt.Color(87, 4, 4));
        areaCaracteristicasGemeos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tituloCarecteristicasGemeos.setFont(new java.awt.Font("Viner Hand ITC", 1, 20)); // NOI18N
        tituloCarecteristicasGemeos.setForeground(new java.awt.Color(255, 255, 255));
        tituloCarecteristicasGemeos.setText("Características");

        pfortesGemeos.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        pfortesGemeos.setForeground(new java.awt.Color(255, 255, 255));
        pfortesGemeos.setText("Pontos Fortes:");

        pMelhorarGemeos.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        pMelhorarGemeos.setForeground(new java.awt.Color(255, 255, 255));
        pMelhorarGemeos.setText("Pontos a Melhorar:");

        txFortesGemeos.setColumns(20);
        txFortesGemeos.setRows(5);
        txFortesGemeos.setText("Comunicação, criatividade, curiosidade e \nfacilidade para aprender coisas novas.");
        jScrollPane7.setViewportView(txFortesGemeos);

        txMelhorarGemeos.setColumns(20);
        txMelhorarGemeos.setRows(5);
        txMelhorarGemeos.setText("Evitar a dispersão, terminar o que começa \ne pensar antes de tomar decisões.");
        jScrollPane8.setViewportView(txMelhorarGemeos);

        javax.swing.GroupLayout areaCaracteristicasGemeosLayout = new javax.swing.GroupLayout(areaCaracteristicasGemeos);
        areaCaracteristicasGemeos.setLayout(areaCaracteristicasGemeosLayout);
        areaCaracteristicasGemeosLayout.setHorizontalGroup(
            areaCaracteristicasGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasGemeosLayout.createSequentialGroup()
                .addGroup(areaCaracteristicasGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaCaracteristicasGemeosLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(areaCaracteristicasGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pfortesGemeos)
                            .addComponent(pMelhorarGemeos)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                            .addComponent(jScrollPane7)))
                    .addGroup(areaCaracteristicasGemeosLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(tituloCarecteristicasGemeos)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        areaCaracteristicasGemeosLayout.setVerticalGroup(
            areaCaracteristicasGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasGemeosLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloCarecteristicasGemeos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pfortesGemeos)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pMelhorarGemeos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        gemeos.add(areaCaracteristicasGemeos, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 300, 330));

        areaPrevisaoGemeos.setBackground(new java.awt.Color(87, 4, 4));
        areaPrevisaoGemeos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        previsaoGemeos.setFont(new java.awt.Font("Viner Hand ITC", 1, 20)); // NOI18N
        previsaoGemeos.setForeground(new java.awt.Color(255, 255, 255));
        previsaoGemeos.setText("Previsão do Dia:");

        btnAtualizarPrevisaoGemeos.setBackground(new java.awt.Color(255, 255, 204));
        btnAtualizarPrevisaoGemeos.setFont(new java.awt.Font("OCR A Extended", 1, 12)); // NOI18N
        btnAtualizarPrevisaoGemeos.setText("Atualizar Previsão");
        btnAtualizarPrevisaoGemeos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAtualizarPrevisaoGemeos.setPreferredSize(new java.awt.Dimension(157, 32));
        btnAtualizarPrevisaoGemeos.addActionListener(this::btnAtualizarPrevisaoGemeosActionPerformed);

        txtPrevisaoGemeos.setColumns(20);
        txtPrevisaoGemeos.setRows(5);
        txtPrevisaoGemeos.setText("\n");
        txPrevisaoAries2.setViewportView(txtPrevisaoGemeos);

        javax.swing.GroupLayout areaPrevisaoGemeosLayout = new javax.swing.GroupLayout(areaPrevisaoGemeos);
        areaPrevisaoGemeos.setLayout(areaPrevisaoGemeosLayout);
        areaPrevisaoGemeosLayout.setHorizontalGroup(
            areaPrevisaoGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoGemeosLayout.createSequentialGroup()
                .addGroup(areaPrevisaoGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisaoGemeosLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(btnAtualizarPrevisaoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaPrevisaoGemeosLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(previsaoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaPrevisaoGemeosLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(txPrevisaoAries2, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        areaPrevisaoGemeosLayout.setVerticalGroup(
            areaPrevisaoGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoGemeosLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(previsaoGemeos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txPrevisaoAries2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnAtualizarPrevisaoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        gemeos.add(areaPrevisaoGemeos, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, 330, 320));

        areaEnergiaGemeos.setBackground(new java.awt.Color(87, 4, 4));
        areaEnergiaGemeos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tituloEnergiaGemeos.setFont(new java.awt.Font("Viner Hand ITC", 1, 20)); // NOI18N
        tituloEnergiaGemeos.setForeground(new java.awt.Color(255, 255, 255));
        tituloEnergiaGemeos.setText("Energia do Dia");

        amorGemeos.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        amorGemeos.setForeground(new java.awt.Color(255, 255, 255));
        amorGemeos.setText("Amor:");

        trabalhoGemeos.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        trabalhoGemeos.setForeground(new java.awt.Color(255, 255, 255));
        trabalhoGemeos.setText("Trabalho:");

        saudeGemeos.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        saudeGemeos.setForeground(new java.awt.Color(255, 255, 255));
        saudeGemeos.setText("Saúde:");

        sorteGemeos.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        sorteGemeos.setForeground(new java.awt.Color(255, 255, 255));
        sorteGemeos.setText("Sorte:");

        tfAmorGemeos.setText("80%");
        tfAmorGemeos.addActionListener(this::tfAmorGemeosActionPerformed);

        tfTrabalhoGemeos.setText("88%");
        tfTrabalhoGemeos.setPreferredSize(new java.awt.Dimension(165, 26));

        tfSaudeGemeos.setText("72%");
        tfSaudeGemeos.setPreferredSize(new java.awt.Dimension(165, 26));

        tfSorteGemeos.setText("85%");
        tfSorteGemeos.setPreferredSize(new java.awt.Dimension(265, 26));

        javax.swing.GroupLayout areaEnergiaGemeosLayout = new javax.swing.GroupLayout(areaEnergiaGemeos);
        areaEnergiaGemeos.setLayout(areaEnergiaGemeosLayout);
        areaEnergiaGemeosLayout.setHorizontalGroup(
            areaEnergiaGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaGemeosLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(areaEnergiaGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(trabalhoGemeos)
                    .addComponent(amorGemeos)
                    .addComponent(saudeGemeos)
                    .addComponent(sorteGemeos)
                    .addComponent(tfSaudeGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTrabalhoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSorteGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(areaEnergiaGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(tituloEnergiaGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfAmorGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        areaEnergiaGemeosLayout.setVerticalGroup(
            areaEnergiaGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaGemeosLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(tituloEnergiaGemeos)
                .addGap(18, 18, 18)
                .addComponent(amorGemeos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(trabalhoGemeos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTrabalhoGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saudeGemeos)
                .addGap(1, 1, 1)
                .addComponent(tfSaudeGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sorteGemeos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSorteGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        gemeos.add(areaEnergiaGemeos, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 30, 380, 300));

        areaMensagemGemeos.setBackground(new java.awt.Color(87, 4, 4));
        areaMensagemGemeos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tituloMensagemGemeos.setFont(new java.awt.Font("Viner Hand ITC", 1, 20)); // NOI18N
        tituloMensagemGemeos.setForeground(new java.awt.Color(255, 255, 255));
        tituloMensagemGemeos.setText("Mensagem do Dia:");

        txMensagemGemeos.setColumns(20);
        txMensagemGemeos.setRows(5);
        jScrollPane9.setViewportView(txMensagemGemeos);

        btnCopiarMensagemGemeos.setBackground(new java.awt.Color(255, 255, 204));
        btnCopiarMensagemGemeos.setFont(new java.awt.Font("OCR A Extended", 1, 12)); // NOI18N
        btnCopiarMensagemGemeos.setText("Copiar Mensagem");
        btnCopiarMensagemGemeos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCopiarMensagemGemeos.setPreferredSize(new java.awt.Dimension(103, 32));

        javax.swing.GroupLayout areaMensagemGemeosLayout = new javax.swing.GroupLayout(areaMensagemGemeos);
        areaMensagemGemeos.setLayout(areaMensagemGemeosLayout);
        areaMensagemGemeosLayout.setHorizontalGroup(
            areaMensagemGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemGemeosLayout.createSequentialGroup()
                .addGroup(areaMensagemGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaMensagemGemeosLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(tituloMensagemGemeos))
                    .addGroup(areaMensagemGemeosLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(btnCopiarMensagemGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaMensagemGemeosLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        areaMensagemGemeosLayout.setVerticalGroup(
            areaMensagemGemeosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemGemeosLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(tituloMensagemGemeos)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMensagemGemeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        gemeos.add(areaMensagemGemeos, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 490, 380, 280));

        fundoGemeos.setIcon(new javax.swing.ImageIcon("C:\\Users\\CleicianeGomes\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\all5.png")); // NOI18N
        gemeos.add(fundoGemeos, new org.netbeans.lib.awtextra.AbsoluteConstraints(-230, -30, -1, -1));

        txPrevisaoAquario.addTab("Gêmeos", gemeos);

        cancer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaInformacoesCancer.setBackground(new java.awt.Color(87, 4, 4));
        areaInformacoesCancer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        imgSignoCancer.setIcon(new javax.swing.ImageIcon("C:\\Users\\CleicianeGomes\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\cancer.jpg")); // NOI18N

        tituloCancer.setFont(new java.awt.Font("Viner Hand ITC", 1, 20)); // NOI18N
        tituloCancer.setForeground(new java.awt.Color(255, 255, 255));
        tituloCancer.setText("Câncer");

        periodoCancer.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        periodoCancer.setForeground(new java.awt.Color(255, 255, 255));
        periodoCancer.setText("Periodo:");

        elementoCancer.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        elementoCancer.setForeground(new java.awt.Color(255, 255, 255));
        elementoCancer.setText("Elemento:");

        planetaCancer.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        planetaCancer.setForeground(new java.awt.Color(255, 255, 255));
        planetaCancer.setText("Planeta Regente:");

        corCancer.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        corCancer.setForeground(new java.awt.Color(255, 255, 255));
        corCancer.setText("Cor:");

        numeroCancer.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        numeroCancer.setForeground(new java.awt.Color(255, 255, 255));
        numeroCancer.setText("Número da sorte:");

        tfPeriodoCancer.setBackground(new java.awt.Color(255, 255, 204));
        tfPeriodoCancer.setText("21/06 a 22/07");

        tfElementoCancer.setBackground(new java.awt.Color(255, 255, 204));
        tfElementoCancer.setText("Água");

        tfPlanetaCancer.setBackground(new java.awt.Color(255, 255, 204));
        tfPlanetaCancer.setText("Lua");
        tfPlanetaCancer.addActionListener(this::tfPlanetaCancerActionPerformed);

        tfCorCancer.setBackground(new java.awt.Color(255, 255, 204));
        tfCorCancer.setText("Branco");
        tfCorCancer.addActionListener(this::tfCorCancerActionPerformed);

        tfNumeroCancer.setBackground(new java.awt.Color(255, 255, 204));
        tfNumeroCancer.setText("2");
        tfNumeroCancer.addActionListener(this::tfNumeroCancerActionPerformed);

        javax.swing.GroupLayout areaInformacoesCancerLayout = new javax.swing.GroupLayout(areaInformacoesCancer);
        areaInformacoesCancer.setLayout(areaInformacoesCancerLayout);
        areaInformacoesCancerLayout.setHorizontalGroup(
            areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesCancerLayout.createSequentialGroup()
                .addGroup(areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgSignoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(areaInformacoesCancerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoesCancerLayout.createSequentialGroup()
                                .addGroup(areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(periodoCancer)
                                    .addComponent(elementoCancer))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfPeriodoCancer)
                                    .addComponent(tfElementoCancer)))
                            .addGroup(areaInformacoesCancerLayout.createSequentialGroup()
                                .addGroup(areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(areaInformacoesCancerLayout.createSequentialGroup()
                                        .addComponent(corCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfCorCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tituloCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(areaInformacoesCancerLayout.createSequentialGroup()
                                        .addComponent(planetaCancer)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfPlanetaCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(areaInformacoesCancerLayout.createSequentialGroup()
                                        .addComponent(numeroCancer)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfNumeroCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 32, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        areaInformacoesCancerLayout.setVerticalGroup(
            areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesCancerLayout.createSequentialGroup()
                .addComponent(imgSignoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tituloCancer)
                .addGroup(areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoesCancerLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfElementoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(elementoCancer)))
                    .addGroup(areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfPeriodoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(periodoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaCancer)
                    .addComponent(tfPlanetaCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corCancer)
                    .addComponent(tfCorCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroCancer)
                    .addComponent(tfNumeroCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        cancer.add(areaInformacoesCancer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 310, 760));

        areaCaracteristicasCancer.setBackground(new java.awt.Color(87, 4, 4));
        areaCaracteristicasCancer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tituloCarecteristicasCancer.setFont(new java.awt.Font("Viner Hand ITC", 1, 20)); // NOI18N
        tituloCarecteristicasCancer.setForeground(new java.awt.Color(255, 255, 255));
        tituloCarecteristicasCancer.setText("Características");

        pfortesCancer.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        pfortesCancer.setForeground(new java.awt.Color(255, 255, 255));
        pfortesCancer.setText("Pontos Fortes:");

        pMelhorarCancer.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        pMelhorarCancer.setForeground(new java.awt.Color(255, 255, 255));
        pMelhorarCancer.setText("Pontos a Melhorar:");

        txFortesCancer.setColumns(20);
        txFortesCancer.setRows(5);
        txFortesCancer.setText("Sensibilidade, empatia, proteção e \ndedicação às pessoas que ama.");
        jScrollPane10.setViewportView(txFortesCancer);

        txMelhorarCancer.setColumns(20);
        txMelhorarCancer.setRows(5);
        txMelhorarCancer.setText("Evitar guardar sentimentos, não levar \ntudo para o lado pessoal e aprender a \nestabelecer limites.");
        jScrollPane11.setViewportView(txMelhorarCancer);

        javax.swing.GroupLayout areaCaracteristicasCancerLayout = new javax.swing.GroupLayout(areaCaracteristicasCancer);
        areaCaracteristicasCancer.setLayout(areaCaracteristicasCancerLayout);
        areaCaracteristicasCancerLayout.setHorizontalGroup(
            areaCaracteristicasCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasCancerLayout.createSequentialGroup()
                .addGroup(areaCaracteristicasCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaCaracteristicasCancerLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(areaCaracteristicasCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pfortesCancer)
                            .addComponent(pMelhorarCancer)))
                    .addGroup(areaCaracteristicasCancerLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(tituloCarecteristicasCancer)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        areaCaracteristicasCancerLayout.setVerticalGroup(
            areaCaracteristicasCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasCancerLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloCarecteristicasCancer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pfortesCancer)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pMelhorarCancer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        cancer.add(areaCaracteristicasCancer, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 300, 330));

        areaPrevisaoCancer.setBackground(new java.awt.Color(87, 4, 4));
        areaPrevisaoCancer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        previsaoCancer.setFont(new java.awt.Font("Viner Hand ITC", 1, 20)); // NOI18N
        previsaoCancer.setForeground(new java.awt.Color(255, 255, 255));
        previsaoCancer.setText("Previsão do Dia:");

        btnAtualizarPrevisaoCancer.setBackground(new java.awt.Color(255, 255, 204));
        btnAtualizarPrevisaoCancer.setFont(new java.awt.Font("OCR A Extended", 1, 12)); // NOI18N
        btnAtualizarPrevisaoCancer.setText("Atualizar Previsão");
        btnAtualizarPrevisaoCancer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAtualizarPrevisaoCancer.setPreferredSize(new java.awt.Dimension(157, 32));
        btnAtualizarPrevisaoCancer.addActionListener(this::btnAtualizarPrevisaoCancerActionPerformed);

        txtPrevisaoCancer.setColumns(20);
        txtPrevisaoCancer.setRows(5);
        txPrevisaoAries3.setViewportView(txtPrevisaoCancer);

        javax.swing.GroupLayout areaPrevisaoCancerLayout = new javax.swing.GroupLayout(areaPrevisaoCancer);
        areaPrevisaoCancer.setLayout(areaPrevisaoCancerLayout);
        areaPrevisaoCancerLayout.setHorizontalGroup(
            areaPrevisaoCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoCancerLayout.createSequentialGroup()
                .addGroup(areaPrevisaoCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisaoCancerLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(btnAtualizarPrevisaoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaPrevisaoCancerLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(previsaoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaPrevisaoCancerLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(txPrevisaoAries3, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        areaPrevisaoCancerLayout.setVerticalGroup(
            areaPrevisaoCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoCancerLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(previsaoCancer)
                .addGap(31, 31, 31)
                .addComponent(txPrevisaoAries3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnAtualizarPrevisaoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        cancer.add(areaPrevisaoCancer, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, 300, 320));

        areaEnergiaCancer.setBackground(new java.awt.Color(87, 4, 4));
        areaEnergiaCancer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tituloEnergiaCancer.setFont(new java.awt.Font("Viner Hand ITC", 1, 20)); // NOI18N
        tituloEnergiaCancer.setForeground(new java.awt.Color(255, 255, 255));
        tituloEnergiaCancer.setText("Energia do Dia");

        amorCancer.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        amorCancer.setForeground(new java.awt.Color(255, 255, 255));
        amorCancer.setText("Amor:");

        trabalhoCancer.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        trabalhoCancer.setForeground(new java.awt.Color(255, 255, 255));
        trabalhoCancer.setText("Trabalho:");

        saudeCancer.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        saudeCancer.setForeground(new java.awt.Color(255, 255, 255));
        saudeCancer.setText("Saúde:");

        sorteCancer.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        sorteCancer.setForeground(new java.awt.Color(255, 255, 255));
        sorteCancer.setText("Sorte:");

        tfAmorCancer.setText("92%");
        tfAmorCancer.addActionListener(this::tfAmorCancerActionPerformed);

        tfTrabalhoCancer.setText("78%");
        tfTrabalhoCancer.setPreferredSize(new java.awt.Dimension(165, 26));

        tfSaudeCancer.setText("80%");
        tfSaudeCancer.setPreferredSize(new java.awt.Dimension(165, 26));
        tfSaudeCancer.addActionListener(this::tfSaudeCancerActionPerformed);

        tfSorteCancer.setText("76%");
        tfSorteCancer.setPreferredSize(new java.awt.Dimension(265, 26));

        javax.swing.GroupLayout areaEnergiaCancerLayout = new javax.swing.GroupLayout(areaEnergiaCancer);
        areaEnergiaCancer.setLayout(areaEnergiaCancerLayout);
        areaEnergiaCancerLayout.setHorizontalGroup(
            areaEnergiaCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaCancerLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(areaEnergiaCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(trabalhoCancer)
                    .addComponent(amorCancer)
                    .addComponent(saudeCancer)
                    .addComponent(sorteCancer)
                    .addComponent(tfSaudeCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTrabalhoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSorteCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(areaEnergiaCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(tituloEnergiaCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfAmorCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        areaEnergiaCancerLayout.setVerticalGroup(
            areaEnergiaCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaCancerLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(tituloEnergiaCancer)
                .addGap(18, 18, 18)
                .addComponent(amorCancer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(trabalhoCancer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTrabalhoCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saudeCancer)
                .addGap(1, 1, 1)
                .addComponent(tfSaudeCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sorteCancer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSorteCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        cancer.add(areaEnergiaCancer, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 30, 380, 300));

        areaMensagemCancer.setBackground(new java.awt.Color(87, 4, 4));
        areaMensagemCancer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tituloMensagemCancer.setFont(new java.awt.Font("Viner Hand ITC", 1, 20)); // NOI18N
        tituloMensagemCancer.setForeground(new java.awt.Color(255, 255, 255));
        tituloMensagemCancer.setText("Mensagem do Dia:");

        txMensagemCancer.setColumns(20);
        txMensagemCancer.setRows(5);
        jScrollPane12.setViewportView(txMensagemCancer);

        btnCopiarMensagemCancer.setBackground(new java.awt.Color(255, 255, 204));
        btnCopiarMensagemCancer.setFont(new java.awt.Font("OCR A Extended", 1, 12)); // NOI18N
        btnCopiarMensagemCancer.setText("Copiar Mensagem");
        btnCopiarMensagemCancer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCopiarMensagemCancer.setPreferredSize(new java.awt.Dimension(103, 32));

        javax.swing.GroupLayout areaMensagemCancerLayout = new javax.swing.GroupLayout(areaMensagemCancer);
        areaMensagemCancer.setLayout(areaMensagemCancerLayout);
        areaMensagemCancerLayout.setHorizontalGroup(
            areaMensagemCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemCancerLayout.createSequentialGroup()
                .addGroup(areaMensagemCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaMensagemCancerLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(tituloMensagemCancer))
                    .addGroup(areaMensagemCancerLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaMensagemCancerLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(btnCopiarMensagemCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        areaMensagemCancerLayout.setVerticalGroup(
            areaMensagemCancerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemCancerLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(tituloMensagemCancer)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMensagemCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        cancer.add(areaMensagemCancer, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 420, 380, 280));

        fundoCancer.setIcon(new javax.swing.ImageIcon("C:\\Users\\CleicianeGomes\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\all5.png")); // NOI18N
        cancer.add(fundoCancer, new org.netbeans.lib.awtextra.AbsoluteConstraints(-240, -60, -1, -1));

        txPrevisaoAquario.addTab("Câncer", cancer);

        leao.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaInformacoesLeao.setBackground(new java.awt.Color(87, 4, 4));
        areaInformacoesLeao.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        imgSignoLeao.setIcon(new javax.swing.ImageIcon("C:\\Users\\CleicianeGomes\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\leo.jpg")); // NOI18N

        tituloLeao.setFont(new java.awt.Font("Viner Hand ITC", 1, 20)); // NOI18N
        tituloLeao.setForeground(new java.awt.Color(255, 255, 255));
        tituloLeao.setText("Leão");

        periodoLeao.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        periodoLeao.setForeground(new java.awt.Color(255, 255, 255));
        periodoLeao.setText("Periodo:");

        elementoLeao.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        elementoLeao.setForeground(new java.awt.Color(255, 255, 255));
        elementoLeao.setText("Elemento:");

        planetaLeao.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        planetaLeao.setForeground(new java.awt.Color(255, 255, 255));
        planetaLeao.setText("Planeta Regente:");

        corLeao.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        corLeao.setForeground(new java.awt.Color(255, 255, 255));
        corLeao.setText("Cor:");

        numeroLeao.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        numeroLeao.setForeground(new java.awt.Color(255, 255, 255));
        numeroLeao.setText("Número da sorte:");

        tfPeriodoLeao.setBackground(new java.awt.Color(255, 255, 204));
        tfPeriodoLeao.setText("23/07 a 22/08");

        tfElementoLeao.setBackground(new java.awt.Color(255, 255, 204));
        tfElementoLeao.setText("Fogo");
        tfElementoLeao.addActionListener(this::tfElementoLeaoActionPerformed);

        tfPlanetaLeao.setBackground(new java.awt.Color(255, 255, 204));
        tfPlanetaLeao.setText("Sol");
        tfPlanetaLeao.addActionListener(this::tfPlanetaLeaoActionPerformed);

        tfCorLeao.setBackground(new java.awt.Color(255, 255, 204));
        tfCorLeao.setText("Dourado");
        tfCorLeao.addActionListener(this::tfCorLeaoActionPerformed);

        tfNumeroLeao.setBackground(new java.awt.Color(255, 255, 204));
        tfNumeroLeao.setText("1");

        javax.swing.GroupLayout areaInformacoesLeaoLayout = new javax.swing.GroupLayout(areaInformacoesLeao);
        areaInformacoesLeao.setLayout(areaInformacoesLeaoLayout);
        areaInformacoesLeaoLayout.setHorizontalGroup(
            areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesLeaoLayout.createSequentialGroup()
                .addGroup(areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgSignoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(areaInformacoesLeaoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoesLeaoLayout.createSequentialGroup()
                                .addGroup(areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(periodoLeao)
                                    .addComponent(elementoLeao))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfPeriodoLeao)
                                    .addComponent(tfElementoLeao)))
                            .addGroup(areaInformacoesLeaoLayout.createSequentialGroup()
                                .addGroup(areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(areaInformacoesLeaoLayout.createSequentialGroup()
                                        .addComponent(corLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfCorLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tituloLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(areaInformacoesLeaoLayout.createSequentialGroup()
                                        .addComponent(planetaLeao)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfPlanetaLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(areaInformacoesLeaoLayout.createSequentialGroup()
                                        .addComponent(numeroLeao)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfNumeroLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 32, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        areaInformacoesLeaoLayout.setVerticalGroup(
            areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesLeaoLayout.createSequentialGroup()
                .addComponent(imgSignoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tituloLeao)
                .addGroup(areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoesLeaoLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfElementoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(elementoLeao)))
                    .addGroup(areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfPeriodoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(periodoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaLeao)
                    .addComponent(tfPlanetaLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corLeao)
                    .addComponent(tfCorLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroLeao)
                    .addComponent(tfNumeroLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        leao.add(areaInformacoesLeao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 310, 760));

        areaCaracteristicasLeao.setBackground(new java.awt.Color(87, 4, 4));
        areaCaracteristicasLeao.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tituloCarecteristicasLeao.setFont(new java.awt.Font("Viner Hand ITC", 1, 20)); // NOI18N
        tituloCarecteristicasLeao.setForeground(new java.awt.Color(255, 255, 255));
        tituloCarecteristicasLeao.setText("Características");

        pfortesLeao.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        pfortesLeao.setForeground(new java.awt.Color(255, 255, 255));
        pfortesLeao.setText("Pontos Fortes:");

        pMelhorarLeao.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        pMelhorarLeao.setForeground(new java.awt.Color(255, 255, 255));
        pMelhorarLeao.setText("Pontos a Melhorar:");

        txFortesLeao.setColumns(20);
        txFortesLeao.setRows(5);
        txFortesLeao.setText("Liderança, criatividade, confiança e \ngenerosidade.Tem facilidade\npara motivar outras pessoas.");
        jScrollPane13.setViewportView(txFortesLeao);

        txMelhorarLeao.setColumns(20);
        txMelhorarLeao.setRows(5);
        txMelhorarLeao.setText("Controlar o orgulho, aceitar críticas e \nlembrar que ouvir também faz parte da \nliderança.");
        jScrollPane14.setViewportView(txMelhorarLeao);

        javax.swing.GroupLayout areaCaracteristicasLeaoLayout = new javax.swing.GroupLayout(areaCaracteristicasLeao);
        areaCaracteristicasLeao.setLayout(areaCaracteristicasLeaoLayout);
        areaCaracteristicasLeaoLayout.setHorizontalGroup(
            areaCaracteristicasLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasLeaoLayout.createSequentialGroup()
                .addGroup(areaCaracteristicasLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaCaracteristicasLeaoLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(areaCaracteristicasLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pfortesLeao)
                            .addComponent(pMelhorarLeao)
                            .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(areaCaracteristicasLeaoLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(tituloCarecteristicasLeao)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        areaCaracteristicasLeaoLayout.setVerticalGroup(
            areaCaracteristicasLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasLeaoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloCarecteristicasLeao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pfortesLeao)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pMelhorarLeao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        leao.add(areaCaracteristicasLeao, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 300, 330));

        areaPrevisaoLeao.setBackground(new java.awt.Color(87, 4, 4));
        areaPrevisaoLeao.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        previsaoLeao.setFont(new java.awt.Font("Viner Hand ITC", 1, 20)); // NOI18N
        previsaoLeao.setForeground(new java.awt.Color(255, 255, 255));
        previsaoLeao.setText("Previsão do Dia:");

        btnAtualizarPrevisaoLeao.setBackground(new java.awt.Color(255, 255, 204));
        btnAtualizarPrevisaoLeao.setFont(new java.awt.Font("OCR A Extended", 1, 12)); // NOI18N
        btnAtualizarPrevisaoLeao.setText("Atualizar Previsão");
        btnAtualizarPrevisaoLeao.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAtualizarPrevisaoLeao.setPreferredSize(new java.awt.Dimension(157, 32));
        btnAtualizarPrevisaoLeao.addActionListener(this::btnAtualizarPrevisaoLeaoActionPerformed);

        txtPrevisaoLeao.setColumns(20);
        txtPrevisaoLeao.setRows(5);
        txPrevisaoAries4.setViewportView(txtPrevisaoLeao);

        javax.swing.GroupLayout areaPrevisaoLeaoLayout = new javax.swing.GroupLayout(areaPrevisaoLeao);
        areaPrevisaoLeao.setLayout(areaPrevisaoLeaoLayout);
        areaPrevisaoLeaoLayout.setHorizontalGroup(
            areaPrevisaoLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoLeaoLayout.createSequentialGroup()
                .addGroup(areaPrevisaoLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisaoLeaoLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(btnAtualizarPrevisaoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaPrevisaoLeaoLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(previsaoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaPrevisaoLeaoLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(txPrevisaoAries4, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        areaPrevisaoLeaoLayout.setVerticalGroup(
            areaPrevisaoLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoLeaoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(previsaoLeao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txPrevisaoAries4, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnAtualizarPrevisaoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        leao.add(areaPrevisaoLeao, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, 300, 320));

        areaEnergiaLeao.setBackground(new java.awt.Color(87, 4, 4));
        areaEnergiaLeao.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tituloEnergiaLeao.setFont(new java.awt.Font("Viner Hand ITC", 1, 20)); // NOI18N
        tituloEnergiaLeao.setForeground(new java.awt.Color(255, 255, 255));
        tituloEnergiaLeao.setText("Energia do Dia");

        amorLeao.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        amorLeao.setForeground(new java.awt.Color(255, 255, 255));
        amorLeao.setText("Amor:");

        trabalhoLeao.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        trabalhoLeao.setForeground(new java.awt.Color(255, 255, 255));
        trabalhoLeao.setText("Trabalho:");

        saudeLeao.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        saudeLeao.setForeground(new java.awt.Color(255, 255, 255));
        saudeLeao.setText("Saúde:");

        sorteLeao.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        sorteLeao.setForeground(new java.awt.Color(255, 255, 255));
        sorteLeao.setText("Sorte:");

        tfAmorLeao.setText("88%");

        tfTrabalhoLeao.setText("94%");
        tfTrabalhoLeao.setPreferredSize(new java.awt.Dimension(165, 26));

        tfSaudeLeao.setText("82%");
        tfSaudeLeao.setPreferredSize(new java.awt.Dimension(165, 26));
        tfSaudeLeao.addActionListener(this::tfSaudeLeaoActionPerformed);

        tfSorteLeao.setText("90%");
        tfSorteLeao.setPreferredSize(new java.awt.Dimension(265, 26));

        javax.swing.GroupLayout areaEnergiaLeaoLayout = new javax.swing.GroupLayout(areaEnergiaLeao);
        areaEnergiaLeao.setLayout(areaEnergiaLeaoLayout);
        areaEnergiaLeaoLayout.setHorizontalGroup(
            areaEnergiaLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaLeaoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(areaEnergiaLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(trabalhoLeao)
                    .addComponent(amorLeao)
                    .addComponent(saudeLeao)
                    .addComponent(sorteLeao)
                    .addComponent(tfSaudeLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTrabalhoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSorteLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(areaEnergiaLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(tituloEnergiaLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfAmorLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        areaEnergiaLeaoLayout.setVerticalGroup(
            areaEnergiaLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaLeaoLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(tituloEnergiaLeao)
                .addGap(18, 18, 18)
                .addComponent(amorLeao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(trabalhoLeao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTrabalhoLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saudeLeao)
                .addGap(1, 1, 1)
                .addComponent(tfSaudeLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sorteLeao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSorteLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        leao.add(areaEnergiaLeao, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 30, 380, 300));

        areaMensagemLeao.setBackground(new java.awt.Color(87, 4, 4));
        areaMensagemLeao.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tituloMensagemLeao.setFont(new java.awt.Font("Viner Hand ITC", 1, 20)); // NOI18N
        tituloMensagemLeao.setForeground(new java.awt.Color(255, 255, 255));
        tituloMensagemLeao.setText("Mensagem do Dia:");

        txMensagemLeao.setColumns(20);
        txMensagemLeao.setRows(5);
        jScrollPane15.setViewportView(txMensagemLeao);

        btnCopiarMensagemLeao.setBackground(new java.awt.Color(255, 255, 204));
        btnCopiarMensagemLeao.setFont(new java.awt.Font("OCR A Extended", 1, 12)); // NOI18N
        btnCopiarMensagemLeao.setText("Copiar Mensagem");
        btnCopiarMensagemLeao.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCopiarMensagemLeao.setPreferredSize(new java.awt.Dimension(103, 32));

        javax.swing.GroupLayout areaMensagemLeaoLayout = new javax.swing.GroupLayout(areaMensagemLeao);
        areaMensagemLeao.setLayout(areaMensagemLeaoLayout);
        areaMensagemLeaoLayout.setHorizontalGroup(
            areaMensagemLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemLeaoLayout.createSequentialGroup()
                .addGroup(areaMensagemLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaMensagemLeaoLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(tituloMensagemLeao))
                    .addGroup(areaMensagemLeaoLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaMensagemLeaoLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(btnCopiarMensagemLeao, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        areaMensagemLeaoLayout.setVerticalGroup(
            areaMensagemLeaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemLeaoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(tituloMensagemLeao)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMensagemLeao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        leao.add(areaMensagemLeao, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 420, 380, 280));

        fundoLeao.setIcon(new javax.swing.ImageIcon("C:\\Users\\CleicianeGomes\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\all5.png")); // NOI18N
        leao.add(fundoLeao, new org.netbeans.lib.awtextra.AbsoluteConstraints(-230, -40, -1, 1020));

        txPrevisaoAquario.addTab("Leão", leao);

        virgem.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaInformacoesVirgem.setBackground(new java.awt.Color(87, 4, 4));
        areaInformacoesVirgem.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        imgSignoVirgem.setIcon(new javax.swing.ImageIcon("C:\\Users\\CleicianeGomes\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\virgo.jpg")); // NOI18N

        tituloVirgem.setFont(new java.awt.Font("Viner Hand ITC", 1, 20)); // NOI18N
        tituloVirgem.setForeground(new java.awt.Color(255, 255, 255));
        tituloVirgem.setText("Virgem");

        periodoVirgem.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        periodoVirgem.setForeground(new java.awt.Color(255, 255, 255));
        periodoVirgem.setText("Periodo:");

        elementoVirgem.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        elementoVirgem.setForeground(new java.awt.Color(255, 255, 255));
        elementoVirgem.setText("Elemento:");

        planetaVirgem.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        planetaVirgem.setForeground(new java.awt.Color(255, 255, 255));
        planetaVirgem.setText("Planeta Regente:");

        corVirgem.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        corVirgem.setForeground(new java.awt.Color(255, 255, 255));
        corVirgem.setText("Cor:");

        numeroVirgem.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        numeroVirgem.setForeground(new java.awt.Color(255, 255, 255));
        numeroVirgem.setText("Número da sorte:");

        tfPeriodoVirgem.setBackground(new java.awt.Color(255, 255, 204));
        tfPeriodoVirgem.setText("23/08 a 22/09 ");
        tfPeriodoVirgem.addActionListener(this::tfPeriodoVirgemActionPerformed);

        tfElementoVirgem.setBackground(new java.awt.Color(255, 255, 204));
        tfElementoVirgem.setText("Terra");

        tfPlanetaVirgem.setBackground(new java.awt.Color(255, 255, 204));
        tfPlanetaVirgem.setText("Mercúrio");

        tfCorVirgem.setBackground(new java.awt.Color(255, 255, 204));
        tfCorVirgem.setText("Azul-marinho");

        tfNumeroVirgem.setBackground(new java.awt.Color(255, 255, 204));
        tfNumeroVirgem.setText("5");
        tfNumeroVirgem.addActionListener(this::tfNumeroVirgemActionPerformed);

        javax.swing.GroupLayout areaInformacoesVirgemLayout = new javax.swing.GroupLayout(areaInformacoesVirgem);
        areaInformacoesVirgem.setLayout(areaInformacoesVirgemLayout);
        areaInformacoesVirgemLayout.setHorizontalGroup(
            areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesVirgemLayout.createSequentialGroup()
                .addGroup(areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgSignoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(areaInformacoesVirgemLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoesVirgemLayout.createSequentialGroup()
                                .addGroup(areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(periodoVirgem)
                                    .addComponent(elementoVirgem))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfPeriodoVirgem)
                                    .addComponent(tfElementoVirgem)))
                            .addGroup(areaInformacoesVirgemLayout.createSequentialGroup()
                                .addGroup(areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(areaInformacoesVirgemLayout.createSequentialGroup()
                                        .addComponent(corVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfCorVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tituloVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(areaInformacoesVirgemLayout.createSequentialGroup()
                                        .addComponent(planetaVirgem)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfPlanetaVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(areaInformacoesVirgemLayout.createSequentialGroup()
                                        .addComponent(numeroVirgem)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfNumeroVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 32, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        areaInformacoesVirgemLayout.setVerticalGroup(
            areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesVirgemLayout.createSequentialGroup()
                .addComponent(imgSignoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tituloVirgem)
                .addGroup(areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoesVirgemLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfElementoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(elementoVirgem)))
                    .addGroup(areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfPeriodoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(periodoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaVirgem)
                    .addComponent(tfPlanetaVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corVirgem)
                    .addComponent(tfCorVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroVirgem)
                    .addComponent(tfNumeroVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        virgem.add(areaInformacoesVirgem, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 310, 760));

        areaCaracteristicasVirgem.setBackground(new java.awt.Color(87, 4, 4));
        areaCaracteristicasVirgem.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tituloCarecteristicasVirgem.setFont(new java.awt.Font("Viner Hand ITC", 1, 20)); // NOI18N
        tituloCarecteristicasVirgem.setForeground(new java.awt.Color(255, 255, 255));
        tituloCarecteristicasVirgem.setText("Características");

        pfortesVirgem.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        pfortesVirgem.setForeground(new java.awt.Color(255, 255, 255));
        pfortesVirgem.setText("Pontos Fortes:");

        pMelhorarVirgem.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        pMelhorarVirgem.setForeground(new java.awt.Color(255, 255, 255));
        pMelhorarVirgem.setText("Pontos a Melhorar:");

        txFortesVirgem.setColumns(20);
        txFortesVirgem.setRows(5);
        txFortesVirgem.setText("Organização, inteligência, atenção \naos detalhes e responsabilidade.");
        jScrollPane16.setViewportView(txFortesVirgem);

        txMelhorarVirgem.setColumns(20);
        txMelhorarVirgem.setRows(5);
        txMelhorarVirgem.setText("Evitar o perfeccionismo excessivo, \npreocupar-se menos e aceitar que \nnem tudo precisa sair perfeito.");
        jScrollPane17.setViewportView(txMelhorarVirgem);

        javax.swing.GroupLayout areaCaracteristicasVirgemLayout = new javax.swing.GroupLayout(areaCaracteristicasVirgem);
        areaCaracteristicasVirgem.setLayout(areaCaracteristicasVirgemLayout);
        areaCaracteristicasVirgemLayout.setHorizontalGroup(
            areaCaracteristicasVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasVirgemLayout.createSequentialGroup()
                .addGroup(areaCaracteristicasVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaCaracteristicasVirgemLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(areaCaracteristicasVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pfortesVirgem)
                            .addComponent(pMelhorarVirgem)))
                    .addGroup(areaCaracteristicasVirgemLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(tituloCarecteristicasVirgem)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        areaCaracteristicasVirgemLayout.setVerticalGroup(
            areaCaracteristicasVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasVirgemLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloCarecteristicasVirgem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pfortesVirgem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(pMelhorarVirgem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        virgem.add(areaCaracteristicasVirgem, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 300, 330));

        areaPrevisaoVirgem.setBackground(new java.awt.Color(87, 4, 4));
        areaPrevisaoVirgem.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        previsaoVirgem.setFont(new java.awt.Font("Viner Hand ITC", 1, 20)); // NOI18N
        previsaoVirgem.setForeground(new java.awt.Color(255, 255, 255));
        previsaoVirgem.setText("Previsão do Dia:");

        btnAtualizarPrevisaoVirgem.setBackground(new java.awt.Color(255, 255, 204));
        btnAtualizarPrevisaoVirgem.setFont(new java.awt.Font("OCR A Extended", 1, 12)); // NOI18N
        btnAtualizarPrevisaoVirgem.setText("Atualizar Previsão");
        btnAtualizarPrevisaoVirgem.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAtualizarPrevisaoVirgem.setPreferredSize(new java.awt.Dimension(157, 32));
        btnAtualizarPrevisaoVirgem.addActionListener(this::btnAtualizarPrevisaoVirgemActionPerformed);

        txtPrevisaoVirgem.setColumns(20);
        txtPrevisaoVirgem.setRows(5);
        txPrevisaoAries5.setViewportView(txtPrevisaoVirgem);

        javax.swing.GroupLayout areaPrevisaoVirgemLayout = new javax.swing.GroupLayout(areaPrevisaoVirgem);
        areaPrevisaoVirgem.setLayout(areaPrevisaoVirgemLayout);
        areaPrevisaoVirgemLayout.setHorizontalGroup(
            areaPrevisaoVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoVirgemLayout.createSequentialGroup()
                .addGroup(areaPrevisaoVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisaoVirgemLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(btnAtualizarPrevisaoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaPrevisaoVirgemLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(previsaoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaPrevisaoVirgemLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(txPrevisaoAries5, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        areaPrevisaoVirgemLayout.setVerticalGroup(
            areaPrevisaoVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoVirgemLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(previsaoVirgem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txPrevisaoAries5, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnAtualizarPrevisaoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        virgem.add(areaPrevisaoVirgem, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, 300, 320));

        areaEnergiaVirgem.setBackground(new java.awt.Color(87, 4, 4));
        areaEnergiaVirgem.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tituloEnergiaVirgem.setFont(new java.awt.Font("Viner Hand ITC", 1, 20)); // NOI18N
        tituloEnergiaVirgem.setForeground(new java.awt.Color(255, 255, 255));
        tituloEnergiaVirgem.setText("Energia do Dia");

        amorVirgem.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        amorVirgem.setForeground(new java.awt.Color(255, 255, 255));
        amorVirgem.setText("Amor:");

        trabalhoVirgem.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        trabalhoVirgem.setForeground(new java.awt.Color(255, 255, 255));
        trabalhoVirgem.setText("Trabalho:");

        saudeVirgem.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        saudeVirgem.setForeground(new java.awt.Color(255, 255, 255));
        saudeVirgem.setText("Saúde:");

        sorteVirgem.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        sorteVirgem.setForeground(new java.awt.Color(255, 255, 255));
        sorteVirgem.setText("Sorte:");

        tfAmorVirgem.setText("82%");
        tfAmorVirgem.addActionListener(this::tfAmorVirgemActionPerformed);

        tfTrabalhoVirgem.setText("95%");
        tfTrabalhoVirgem.setPreferredSize(new java.awt.Dimension(165, 26));

        tfSaudeVirgem.setText("84%");
        tfSaudeVirgem.setPreferredSize(new java.awt.Dimension(165, 26));

        tfSorteVirgem.setText("78%");
        tfSorteVirgem.setPreferredSize(new java.awt.Dimension(265, 26));

        javax.swing.GroupLayout areaEnergiaVirgemLayout = new javax.swing.GroupLayout(areaEnergiaVirgem);
        areaEnergiaVirgem.setLayout(areaEnergiaVirgemLayout);
        areaEnergiaVirgemLayout.setHorizontalGroup(
            areaEnergiaVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaVirgemLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(areaEnergiaVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(trabalhoVirgem)
                    .addComponent(amorVirgem)
                    .addComponent(saudeVirgem)
                    .addComponent(sorteVirgem)
                    .addComponent(tfSaudeVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTrabalhoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSorteVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(areaEnergiaVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(tituloEnergiaVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfAmorVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        areaEnergiaVirgemLayout.setVerticalGroup(
            areaEnergiaVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaVirgemLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(tituloEnergiaVirgem)
                .addGap(18, 18, 18)
                .addComponent(amorVirgem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(trabalhoVirgem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTrabalhoVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saudeVirgem)
                .addGap(1, 1, 1)
                .addComponent(tfSaudeVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sorteVirgem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSorteVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        virgem.add(areaEnergiaVirgem, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 30, 380, 300));

        areaMensagemVirgem.setBackground(new java.awt.Color(87, 4, 4));
        areaMensagemVirgem.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tituloMensagemVirgem.setFont(new java.awt.Font("Viner Hand ITC", 1, 20)); // NOI18N
        tituloMensagemVirgem.setForeground(new java.awt.Color(255, 255, 255));
        tituloMensagemVirgem.setText("Mensagem do Dia:");

        txMensagemVirgem.setColumns(20);
        txMensagemVirgem.setRows(5);
        jScrollPane18.setViewportView(txMensagemVirgem);

        btnCopiarMensagemVirgem.setBackground(new java.awt.Color(255, 255, 204));
        btnCopiarMensagemVirgem.setFont(new java.awt.Font("OCR A Extended", 1, 12)); // NOI18N
        btnCopiarMensagemVirgem.setText("Copiar Mensagem");
        btnCopiarMensagemVirgem.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCopiarMensagemVirgem.setPreferredSize(new java.awt.Dimension(103, 32));

        javax.swing.GroupLayout areaMensagemVirgemLayout = new javax.swing.GroupLayout(areaMensagemVirgem);
        areaMensagemVirgem.setLayout(areaMensagemVirgemLayout);
        areaMensagemVirgemLayout.setHorizontalGroup(
            areaMensagemVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemVirgemLayout.createSequentialGroup()
                .addGroup(areaMensagemVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaMensagemVirgemLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(tituloMensagemVirgem))
                    .addGroup(areaMensagemVirgemLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaMensagemVirgemLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(btnCopiarMensagemVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        areaMensagemVirgemLayout.setVerticalGroup(
            areaMensagemVirgemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemVirgemLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(tituloMensagemVirgem)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMensagemVirgem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        virgem.add(areaMensagemVirgem, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 470, 380, 280));

        fundoVirgem.setIcon(new javax.swing.ImageIcon("C:\\Users\\CleicianeGomes\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\all5.png")); // NOI18N
        virgem.add(fundoVirgem, new org.netbeans.lib.awtextra.AbsoluteConstraints(-110, 0, -1, -1));

        txPrevisaoAquario.addTab("Virgem", virgem);

        libra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaInformacoesLibra.setBackground(new java.awt.Color(87, 4, 4));
        areaInformacoesLibra.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        imgSignoLibra.setIcon(new javax.swing.ImageIcon("C:\\Users\\CleicianeGomes\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\libra.jpg")); // NOI18N

        tituloLibra.setFont(new java.awt.Font("Viner Hand ITC", 1, 20)); // NOI18N
        tituloLibra.setForeground(new java.awt.Color(255, 255, 255));
        tituloLibra.setText("Libra");

        periodoLibra.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        periodoLibra.setForeground(new java.awt.Color(255, 255, 255));
        periodoLibra.setText("Periodo:");

        elementoLibra.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        elementoLibra.setForeground(new java.awt.Color(255, 255, 255));
        elementoLibra.setText("Elemento:");

        planetaLibra.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        planetaLibra.setForeground(new java.awt.Color(255, 255, 255));
        planetaLibra.setText("Planeta Regente:");

        corLibra.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        corLibra.setForeground(new java.awt.Color(255, 255, 255));
        corLibra.setText("Cor:");

        numeroLibra.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        numeroLibra.setForeground(new java.awt.Color(255, 255, 255));
        numeroLibra.setText("Número da sorte:");

        tfPeriodoLibra.setBackground(new java.awt.Color(255, 255, 204));
        tfPeriodoLibra.setText("23/09 a 22/10");

        tfElementoLibra.setBackground(new java.awt.Color(255, 255, 204));
        tfElementoLibra.setText("Ar");

        tfPlanetaLibra.setBackground(new java.awt.Color(255, 255, 204));
        tfPlanetaLibra.setText("Vênus");

        tfCorLibra.setBackground(new java.awt.Color(255, 255, 204));
        tfCorLibra.setText("Rosa");

        tfNumeroLibra.setBackground(new java.awt.Color(255, 255, 204));
        tfNumeroLibra.setText("6\n");

        javax.swing.GroupLayout areaInformacoesLibraLayout = new javax.swing.GroupLayout(areaInformacoesLibra);
        areaInformacoesLibra.setLayout(areaInformacoesLibraLayout);
        areaInformacoesLibraLayout.setHorizontalGroup(
            areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgSignoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                                .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(periodoLibra)
                                    .addComponent(elementoLibra))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfPeriodoLibra)
                                    .addComponent(tfElementoLibra)))
                            .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                                .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                                        .addComponent(corLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfCorLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tituloLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                                        .addComponent(planetaLibra)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfPlanetaLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                                        .addComponent(numeroLibra)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfNumeroLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 32, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        areaInformacoesLibraLayout.setVerticalGroup(
            areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                .addComponent(imgSignoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tituloLibra)
                .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoesLibraLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfElementoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(elementoLibra)))
                    .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfPeriodoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(periodoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaLibra)
                    .addComponent(tfPlanetaLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corLibra)
                    .addComponent(tfCorLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroLibra)
                    .addComponent(tfNumeroLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        libra.add(areaInformacoesLibra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 310, 760));

        areaCaracteristicasLibra.setBackground(new java.awt.Color(87, 4, 4));
        areaCaracteristicasLibra.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tituloCarecteristicasLibra.setFont(new java.awt.Font("Viner Hand ITC", 1, 20)); // NOI18N
        tituloCarecteristicasLibra.setForeground(new java.awt.Color(255, 255, 255));
        tituloCarecteristicasLibra.setText("Características");

        pfortesLibra.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        pfortesLibra.setForeground(new java.awt.Color(255, 255, 255));
        pfortesLibra.setText("Pontos Fortes:");

        pMelhorarLibra.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        pMelhorarLibra.setForeground(new java.awt.Color(255, 255, 255));
        pMelhorarLibra.setText("Pontos a Melhorar:");

        txFortesLibra.setColumns(20);
        txFortesLibra.setRows(5);
        txFortesLibra.setText("Diplomacia, simpatia, criatividade e \nfacilidade para encontrar equilíbrio.");
        jScrollPane19.setViewportView(txFortesLibra);

        txMelhorarLibra.setColumns(20);
        txMelhorarLibra.setRows(5);
        txMelhorarLibra.setText("Evitar a indecisão, confiar mais nas próprias\nescolhas e não tentar agradar todo mundo.");
        jScrollPane20.setViewportView(txMelhorarLibra);

        javax.swing.GroupLayout areaCaracteristicasLibraLayout = new javax.swing.GroupLayout(areaCaracteristicasLibra);
        areaCaracteristicasLibra.setLayout(areaCaracteristicasLibraLayout);
        areaCaracteristicasLibraLayout.setHorizontalGroup(
            areaCaracteristicasLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasLibraLayout.createSequentialGroup()
                .addGroup(areaCaracteristicasLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaCaracteristicasLibraLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(areaCaracteristicasLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pfortesLibra)
                            .addComponent(pMelhorarLibra)
                            .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(areaCaracteristicasLibraLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(tituloCarecteristicasLibra)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        areaCaracteristicasLibraLayout.setVerticalGroup(
            areaCaracteristicasLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasLibraLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloCarecteristicasLibra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pfortesLibra)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pMelhorarLibra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        libra.add(areaCaracteristicasLibra, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 300, 330));

        areaPrevisaoLibra.setBackground(new java.awt.Color(87, 4, 4));
        areaPrevisaoLibra.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        previsaoLibra.setFont(new java.awt.Font("Viner Hand ITC", 1, 20)); // NOI18N
        previsaoLibra.setForeground(new java.awt.Color(255, 255, 255));
        previsaoLibra.setText("Previsão do Dia:");

        btnAtualizarPrevisaoLibra.setBackground(new java.awt.Color(255, 255, 204));
        btnAtualizarPrevisaoLibra.setFont(new java.awt.Font("OCR A Extended", 1, 12)); // NOI18N
        btnAtualizarPrevisaoLibra.setText("Atualizar Previsão");
        btnAtualizarPrevisaoLibra.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAtualizarPrevisaoLibra.setPreferredSize(new java.awt.Dimension(157, 32));
        btnAtualizarPrevisaoLibra.addActionListener(this::btnAtualizarPrevisaoLibraActionPerformed);

        txtPrevisaoLibra.setColumns(20);
        txtPrevisaoLibra.setRows(5);
        txPrevisaoAries6.setViewportView(txtPrevisaoLibra);

        javax.swing.GroupLayout areaPrevisaoLibraLayout = new javax.swing.GroupLayout(areaPrevisaoLibra);
        areaPrevisaoLibra.setLayout(areaPrevisaoLibraLayout);
        areaPrevisaoLibraLayout.setHorizontalGroup(
            areaPrevisaoLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoLibraLayout.createSequentialGroup()
                .addGroup(areaPrevisaoLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisaoLibraLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(btnAtualizarPrevisaoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaPrevisaoLibraLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(previsaoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaPrevisaoLibraLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(txPrevisaoAries6, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        areaPrevisaoLibraLayout.setVerticalGroup(
            areaPrevisaoLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoLibraLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(previsaoLibra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txPrevisaoAries6, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnAtualizarPrevisaoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        libra.add(areaPrevisaoLibra, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 500, 300, 320));

        areaEnergiaLibra.setBackground(new java.awt.Color(87, 4, 4));
        areaEnergiaLibra.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tituloEnergiaLibra.setFont(new java.awt.Font("Viner Hand ITC", 1, 20)); // NOI18N
        tituloEnergiaLibra.setForeground(new java.awt.Color(255, 255, 255));
        tituloEnergiaLibra.setText("Energia do Dia");

        amorLibra.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        amorLibra.setForeground(new java.awt.Color(255, 255, 255));
        amorLibra.setText("Amor:");

        trabalhoLibra.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        trabalhoLibra.setForeground(new java.awt.Color(255, 255, 255));
        trabalhoLibra.setText("Trabalho:");

        saudeLibra.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        saudeLibra.setForeground(new java.awt.Color(255, 255, 255));
        saudeLibra.setText("Saúde:");

        sorteLibra.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        sorteLibra.setForeground(new java.awt.Color(255, 255, 255));
        sorteLibra.setText("Sorte:");

        tfAmorLibra.setText("94%\n");
        tfAmorLibra.addActionListener(this::tfAmorLibraActionPerformed);

        tfTrabalhoLibra.setText("83%");
        tfTrabalhoLibra.setPreferredSize(new java.awt.Dimension(165, 26));

        tfSaudeLibra.setText("79%");
        tfSaudeLibra.setPreferredSize(new java.awt.Dimension(165, 26));

        tfSorteLibra.setText("86%");
        tfSorteLibra.setPreferredSize(new java.awt.Dimension(265, 26));

        javax.swing.GroupLayout areaEnergiaLibraLayout = new javax.swing.GroupLayout(areaEnergiaLibra);
        areaEnergiaLibra.setLayout(areaEnergiaLibraLayout);
        areaEnergiaLibraLayout.setHorizontalGroup(
            areaEnergiaLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaLibraLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(areaEnergiaLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(trabalhoLibra)
                    .addComponent(amorLibra)
                    .addComponent(saudeLibra)
                    .addComponent(sorteLibra)
                    .addComponent(tfSaudeLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTrabalhoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSorteLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(areaEnergiaLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(tituloEnergiaLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfAmorLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        areaEnergiaLibraLayout.setVerticalGroup(
            areaEnergiaLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaLibraLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(tituloEnergiaLibra)
                .addGap(18, 18, 18)
                .addComponent(amorLibra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(trabalhoLibra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTrabalhoLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saudeLibra)
                .addGap(1, 1, 1)
                .addComponent(tfSaudeLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sorteLibra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSorteLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        libra.add(areaEnergiaLibra, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 70, 380, 300));

        areaMensagemLibra.setBackground(new java.awt.Color(87, 4, 4));
        areaMensagemLibra.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tituloMensagemLibra.setFont(new java.awt.Font("Viner Hand ITC", 1, 20)); // NOI18N
        tituloMensagemLibra.setForeground(new java.awt.Color(255, 255, 255));
        tituloMensagemLibra.setText("Mensagem do Dia:");

        txMensagemLibra.setColumns(20);
        txMensagemLibra.setRows(5);
        jScrollPane21.setViewportView(txMensagemLibra);

        btnCopiarMensagemLibra.setBackground(new java.awt.Color(255, 255, 204));
        btnCopiarMensagemLibra.setFont(new java.awt.Font("OCR A Extended", 1, 12)); // NOI18N
        btnCopiarMensagemLibra.setText("Copiar Mensagem");
        btnCopiarMensagemLibra.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCopiarMensagemLibra.setPreferredSize(new java.awt.Dimension(103, 32));

        javax.swing.GroupLayout areaMensagemLibraLayout = new javax.swing.GroupLayout(areaMensagemLibra);
        areaMensagemLibra.setLayout(areaMensagemLibraLayout);
        areaMensagemLibraLayout.setHorizontalGroup(
            areaMensagemLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemLibraLayout.createSequentialGroup()
                .addGroup(areaMensagemLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaMensagemLibraLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(tituloMensagemLibra))
                    .addGroup(areaMensagemLibraLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaMensagemLibraLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(btnCopiarMensagemLibra, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        areaMensagemLibraLayout.setVerticalGroup(
            areaMensagemLibraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemLibraLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(tituloMensagemLibra)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMensagemLibra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        libra.add(areaMensagemLibra, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 530, 380, 280));

        fundoLibra.setIcon(new javax.swing.ImageIcon("C:\\Users\\CleicianeGomes\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\all5.png")); // NOI18N
        libra.add(fundoLibra, new org.netbeans.lib.awtextra.AbsoluteConstraints(-250, -30, -1, -1));

        txPrevisaoAquario.addTab("Libra", libra);

        escorpião.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaInformacoesEscorpiao.setBackground(new java.awt.Color(87, 4, 4));
        areaInformacoesEscorpiao.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        imgSignoEscorpiao.setIcon(new javax.swing.ImageIcon("C:\\Users\\CleicianeGomes\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\escorpiao1.jpg")); // NOI18N

        tituloEscorpiao.setFont(new java.awt.Font("Viner Hand ITC", 1, 20)); // NOI18N
        tituloEscorpiao.setForeground(new java.awt.Color(255, 255, 255));
        tituloEscorpiao.setText("Escorpião");

        periodoEscorpiao.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        periodoEscorpiao.setForeground(new java.awt.Color(255, 255, 255));
        periodoEscorpiao.setText("Periodo:");

        elementoEscorpiao.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        elementoEscorpiao.setForeground(new java.awt.Color(255, 255, 255));
        elementoEscorpiao.setText("Elemento:");

        planetaEscorpiao.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        planetaEscorpiao.setForeground(new java.awt.Color(255, 255, 255));
        planetaEscorpiao.setText("Planeta Regente:");

        corEscorpiao.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        corEscorpiao.setForeground(new java.awt.Color(255, 255, 255));
        corEscorpiao.setText("Cor:");

        numeroEscorpiao.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        numeroEscorpiao.setForeground(new java.awt.Color(255, 255, 255));
        numeroEscorpiao.setText("Número da sorte:");

        tfPeriodoEscorpiao.setBackground(new java.awt.Color(255, 255, 204));
        tfPeriodoEscorpiao.setText("23/10 a 21/11");

        tfElementoEscorpiao.setBackground(new java.awt.Color(255, 255, 204));
        tfElementoEscorpiao.setText("Água");

        tfPlanetaEscorpiao.setBackground(new java.awt.Color(255, 255, 204));
        tfPlanetaEscorpiao.setText("Plutão");

        tfCorEscorpiao.setBackground(new java.awt.Color(255, 255, 204));
        tfCorEscorpiao.setText("Vinho");

        tfNumeroEscorpiao.setBackground(new java.awt.Color(255, 255, 204));
        tfNumeroEscorpiao.setText("8");

        javax.swing.GroupLayout areaInformacoesEscorpiaoLayout = new javax.swing.GroupLayout(areaInformacoesEscorpiao);
        areaInformacoesEscorpiao.setLayout(areaInformacoesEscorpiaoLayout);
        areaInformacoesEscorpiaoLayout.setHorizontalGroup(
            areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgSignoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                                .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(periodoEscorpiao)
                                    .addComponent(elementoEscorpiao))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfPeriodoEscorpiao)
                                    .addComponent(tfElementoEscorpiao)))
                            .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                                .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                                        .addComponent(corEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfCorEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                                        .addComponent(planetaEscorpiao)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfPlanetaEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                                        .addComponent(numeroEscorpiao)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfNumeroEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tituloEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 32, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        areaInformacoesEscorpiaoLayout.setVerticalGroup(
            areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                .addComponent(imgSignoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tituloEscorpiao)
                .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoesEscorpiaoLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfElementoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(elementoEscorpiao)))
                    .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfPeriodoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(periodoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaEscorpiao)
                    .addComponent(tfPlanetaEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corEscorpiao)
                    .addComponent(tfCorEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroEscorpiao)
                    .addComponent(tfNumeroEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        escorpião.add(areaInformacoesEscorpiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 310, 760));

        areaCaracteristicasEscorpiao.setBackground(new java.awt.Color(87, 4, 4));
        areaCaracteristicasEscorpiao.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tituloCarecteristicasEscorpiao.setFont(new java.awt.Font("Viner Hand ITC", 1, 20)); // NOI18N
        tituloCarecteristicasEscorpiao.setForeground(new java.awt.Color(255, 255, 255));
        tituloCarecteristicasEscorpiao.setText("Características");

        pfortesEscorpiao.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        pfortesEscorpiao.setForeground(new java.awt.Color(255, 255, 255));
        pfortesEscorpiao.setText("Pontos Fortes:");

        pMelhorarEscorpiao.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        pMelhorarEscorpiao.setForeground(new java.awt.Color(255, 255, 255));
        pMelhorarEscorpiao.setText("Pontos a Melhorar:");

        txFortesEscorpiao.setColumns(20);
        txFortesEscorpiao.setRows(5);
        txFortesEscorpiao.setText("Determinação, intensidade, coragem e \ncapacidade de superar obstáculos.");
        jScrollPane22.setViewportView(txFortesEscorpiao);

        txMelhorarEscorpiao.setColumns(20);
        txMelhorarEscorpiao.setRows(5);
        txMelhorarEscorpiao.setText(" Evitar guardar ressentimentos, controlar \n o excesso de desconfiança e \n expressar melhor seus sentimentos.");
        jScrollPane23.setViewportView(txMelhorarEscorpiao);

        javax.swing.GroupLayout areaCaracteristicasEscorpiaoLayout = new javax.swing.GroupLayout(areaCaracteristicasEscorpiao);
        areaCaracteristicasEscorpiao.setLayout(areaCaracteristicasEscorpiaoLayout);
        areaCaracteristicasEscorpiaoLayout.setHorizontalGroup(
            areaCaracteristicasEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasEscorpiaoLayout.createSequentialGroup()
                .addGroup(areaCaracteristicasEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaCaracteristicasEscorpiaoLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(areaCaracteristicasEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pfortesEscorpiao)
                            .addComponent(pMelhorarEscorpiao)))
                    .addGroup(areaCaracteristicasEscorpiaoLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(tituloCarecteristicasEscorpiao)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        areaCaracteristicasEscorpiaoLayout.setVerticalGroup(
            areaCaracteristicasEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasEscorpiaoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloCarecteristicasEscorpiao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pfortesEscorpiao)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pMelhorarEscorpiao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        escorpião.add(areaCaracteristicasEscorpiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 300, 330));

        areaPrevisaoEscorpiao.setBackground(new java.awt.Color(87, 4, 4));
        areaPrevisaoEscorpiao.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        previsaoEscorpiao.setFont(new java.awt.Font("Viner Hand ITC", 1, 20)); // NOI18N
        previsaoEscorpiao.setForeground(new java.awt.Color(255, 255, 255));
        previsaoEscorpiao.setText("Previsão do Dia:");

        btnAtualizarPrevisaoEscorpiao.setBackground(new java.awt.Color(255, 255, 204));
        btnAtualizarPrevisaoEscorpiao.setFont(new java.awt.Font("OCR A Extended", 1, 12)); // NOI18N
        btnAtualizarPrevisaoEscorpiao.setText("Atualizar Previsão");
        btnAtualizarPrevisaoEscorpiao.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAtualizarPrevisaoEscorpiao.setPreferredSize(new java.awt.Dimension(157, 32));
        btnAtualizarPrevisaoEscorpiao.addActionListener(this::btnAtualizarPrevisaoEscorpiaoActionPerformed);

        txtPrevisaoEscorpiao.setColumns(20);
        txtPrevisaoEscorpiao.setRows(5);
        txPrevisaoAries7.setViewportView(txtPrevisaoEscorpiao);

        javax.swing.GroupLayout areaPrevisaoEscorpiaoLayout = new javax.swing.GroupLayout(areaPrevisaoEscorpiao);
        areaPrevisaoEscorpiao.setLayout(areaPrevisaoEscorpiaoLayout);
        areaPrevisaoEscorpiaoLayout.setHorizontalGroup(
            areaPrevisaoEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoEscorpiaoLayout.createSequentialGroup()
                .addGroup(areaPrevisaoEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisaoEscorpiaoLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(btnAtualizarPrevisaoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaPrevisaoEscorpiaoLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(previsaoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaPrevisaoEscorpiaoLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(txPrevisaoAries7, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        areaPrevisaoEscorpiaoLayout.setVerticalGroup(
            areaPrevisaoEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoEscorpiaoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(previsaoEscorpiao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txPrevisaoAries7, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnAtualizarPrevisaoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        escorpião.add(areaPrevisaoEscorpiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 500, 300, 320));

        areaEnergiaEscorpiao.setBackground(new java.awt.Color(87, 4, 4));
        areaEnergiaEscorpiao.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tituloEnergiaEscorpiao.setFont(new java.awt.Font("Viner Hand ITC", 1, 20)); // NOI18N
        tituloEnergiaEscorpiao.setForeground(new java.awt.Color(255, 255, 255));
        tituloEnergiaEscorpiao.setText("Energia do Dia");

        amorEscorpiao.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        amorEscorpiao.setForeground(new java.awt.Color(255, 255, 255));
        amorEscorpiao.setText("Amor:");

        trabalhoEscorpiao.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        trabalhoEscorpiao.setForeground(new java.awt.Color(255, 255, 255));
        trabalhoEscorpiao.setText("Trabalho:");

        saudeEscorpiao.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        saudeEscorpiao.setForeground(new java.awt.Color(255, 255, 255));
        saudeEscorpiao.setText("Saúde:");

        sorteEscorpiao.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        sorteEscorpiao.setForeground(new java.awt.Color(255, 255, 255));
        sorteEscorpiao.setText("Sorte:");

        tfAmorEscorpiao.setText("91%");

        tfTrabalhoEscorpiao.setText("89%");
        tfTrabalhoEscorpiao.setPreferredSize(new java.awt.Dimension(165, 26));

        tfSaudeEscorpiao.setText("77%");
        tfSaudeEscorpiao.setPreferredSize(new java.awt.Dimension(165, 26));

        tfSorteEscorpiao.setText("84%");
        tfSorteEscorpiao.setPreferredSize(new java.awt.Dimension(265, 26));

        javax.swing.GroupLayout areaEnergiaEscorpiaoLayout = new javax.swing.GroupLayout(areaEnergiaEscorpiao);
        areaEnergiaEscorpiao.setLayout(areaEnergiaEscorpiaoLayout);
        areaEnergiaEscorpiaoLayout.setHorizontalGroup(
            areaEnergiaEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaEscorpiaoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(areaEnergiaEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(trabalhoEscorpiao)
                    .addComponent(amorEscorpiao)
                    .addComponent(saudeEscorpiao)
                    .addComponent(sorteEscorpiao)
                    .addComponent(tfSaudeEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTrabalhoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSorteEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(areaEnergiaEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(tituloEnergiaEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfAmorEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        areaEnergiaEscorpiaoLayout.setVerticalGroup(
            areaEnergiaEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaEscorpiaoLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(tituloEnergiaEscorpiao)
                .addGap(18, 18, 18)
                .addComponent(amorEscorpiao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(trabalhoEscorpiao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTrabalhoEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saudeEscorpiao)
                .addGap(1, 1, 1)
                .addComponent(tfSaudeEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sorteEscorpiao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSorteEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        escorpião.add(areaEnergiaEscorpiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 60, 380, 300));

        areaMensagemEscorpiao.setBackground(new java.awt.Color(87, 4, 4));
        areaMensagemEscorpiao.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tituloMensagemEscorpiao.setFont(new java.awt.Font("Viner Hand ITC", 1, 20)); // NOI18N
        tituloMensagemEscorpiao.setForeground(new java.awt.Color(255, 255, 255));
        tituloMensagemEscorpiao.setText("Mensagem do Dia:");

        txMensagemEscorpiao.setColumns(20);
        txMensagemEscorpiao.setRows(5);
        jScrollPane24.setViewportView(txMensagemEscorpiao);

        btnCopiarMensagemEscorpiao.setBackground(new java.awt.Color(255, 255, 204));
        btnCopiarMensagemEscorpiao.setFont(new java.awt.Font("OCR A Extended", 1, 12)); // NOI18N
        btnCopiarMensagemEscorpiao.setText("Copiar Mensagem");
        btnCopiarMensagemEscorpiao.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCopiarMensagemEscorpiao.setPreferredSize(new java.awt.Dimension(103, 32));

        javax.swing.GroupLayout areaMensagemEscorpiaoLayout = new javax.swing.GroupLayout(areaMensagemEscorpiao);
        areaMensagemEscorpiao.setLayout(areaMensagemEscorpiaoLayout);
        areaMensagemEscorpiaoLayout.setHorizontalGroup(
            areaMensagemEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemEscorpiaoLayout.createSequentialGroup()
                .addGroup(areaMensagemEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaMensagemEscorpiaoLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(tituloMensagemEscorpiao))
                    .addGroup(areaMensagemEscorpiaoLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaMensagemEscorpiaoLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(btnCopiarMensagemEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        areaMensagemEscorpiaoLayout.setVerticalGroup(
            areaMensagemEscorpiaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemEscorpiaoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(tituloMensagemEscorpiao)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMensagemEscorpiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        escorpião.add(areaMensagemEscorpiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 540, 380, 280));

        fundoEscorpiao.setIcon(new javax.swing.ImageIcon("C:\\Users\\CleicianeGomes\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\all5.png")); // NOI18N
        escorpião.add(fundoEscorpiao, new org.netbeans.lib.awtextra.AbsoluteConstraints(-250, -40, -1, -1));

        txPrevisaoAquario.addTab("Escorpião", escorpião);

        sagitario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaInformacoesSagitario.setBackground(new java.awt.Color(87, 4, 4));
        areaInformacoesSagitario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        imgSignoSagitario.setIcon(new javax.swing.ImageIcon("C:\\Users\\CleicianeGomes\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\sagitario.jpg")); // NOI18N

        tituloSagitario.setFont(new java.awt.Font("Viner Hand ITC", 1, 20)); // NOI18N
        tituloSagitario.setForeground(new java.awt.Color(255, 255, 255));
        tituloSagitario.setText("Sagitário");

        periodoSagitario.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        periodoSagitario.setForeground(new java.awt.Color(255, 255, 255));
        periodoSagitario.setText("Periodo:");

        elementoSagitario.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        elementoSagitario.setForeground(new java.awt.Color(255, 255, 255));
        elementoSagitario.setText("Elemento:");

        planetaSagitario.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        planetaSagitario.setForeground(new java.awt.Color(255, 255, 255));
        planetaSagitario.setText("Planeta Regente:");

        corSagitario.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        corSagitario.setForeground(new java.awt.Color(255, 255, 255));
        corSagitario.setText("Cor:");

        numeroSagitario.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        numeroSagitario.setForeground(new java.awt.Color(255, 255, 255));
        numeroSagitario.setText("Número da sorte:");

        tfPeriodoSagitario.setBackground(new java.awt.Color(255, 255, 204));
        tfPeriodoSagitario.setText("22/11 a 21/12");

        tfElementoSagitario.setBackground(new java.awt.Color(255, 255, 204));
        tfElementoSagitario.setText("Fogo\n");

        tfPlanetaSagitario.setBackground(new java.awt.Color(255, 255, 204));
        tfPlanetaSagitario.setText("Júpiter");

        tfCorSagitario.setBackground(new java.awt.Color(255, 255, 204));
        tfCorSagitario.setText("Roxo");
        tfCorSagitario.addActionListener(this::tfCorSagitarioActionPerformed);

        tfNumeroSagitario.setBackground(new java.awt.Color(255, 255, 204));
        tfNumeroSagitario.setText("3");

        javax.swing.GroupLayout areaInformacoesSagitarioLayout = new javax.swing.GroupLayout(areaInformacoesSagitario);
        areaInformacoesSagitario.setLayout(areaInformacoesSagitarioLayout);
        areaInformacoesSagitarioLayout.setHorizontalGroup(
            areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesSagitarioLayout.createSequentialGroup()
                .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgSignoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(areaInformacoesSagitarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoesSagitarioLayout.createSequentialGroup()
                                .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(periodoSagitario)
                                    .addComponent(elementoSagitario))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfPeriodoSagitario)
                                    .addComponent(tfElementoSagitario)))
                            .addGroup(areaInformacoesSagitarioLayout.createSequentialGroup()
                                .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(areaInformacoesSagitarioLayout.createSequentialGroup()
                                        .addComponent(corSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfCorSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(areaInformacoesSagitarioLayout.createSequentialGroup()
                                        .addComponent(planetaSagitario)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfPlanetaSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(areaInformacoesSagitarioLayout.createSequentialGroup()
                                        .addComponent(numeroSagitario)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfNumeroSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tituloSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 32, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        areaInformacoesSagitarioLayout.setVerticalGroup(
            areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesSagitarioLayout.createSequentialGroup()
                .addComponent(imgSignoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tituloSagitario)
                .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoesSagitarioLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfElementoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(elementoSagitario)))
                    .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfPeriodoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(periodoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaSagitario)
                    .addComponent(tfPlanetaSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corSagitario)
                    .addComponent(tfCorSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroSagitario)
                    .addComponent(tfNumeroSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        sagitario.add(areaInformacoesSagitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 310, 760));

        areaCaracteristicasSagitario.setBackground(new java.awt.Color(87, 4, 4));
        areaCaracteristicasSagitario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tituloCarecteristicasSagitario.setFont(new java.awt.Font("Viner Hand ITC", 1, 20)); // NOI18N
        tituloCarecteristicasSagitario.setForeground(new java.awt.Color(255, 255, 255));
        tituloCarecteristicasSagitario.setText("Características");

        pfortesSagitario.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        pfortesSagitario.setForeground(new java.awt.Color(255, 255, 255));
        pfortesSagitario.setText("Pontos Fortes:");

        pMelhorarSagitario.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        pMelhorarSagitario.setForeground(new java.awt.Color(255, 255, 255));
        pMelhorarSagitario.setText("Pontos a Melhorar:");

        txFortesSagitario.setColumns(20);
        txFortesSagitario.setRows(5);
        txFortesSagitario.setText(" Otimismo, liberdade, sinceridade, \n aventura e facilidade para enxergar \n novas possibilidades.");
        jScrollPane25.setViewportView(txFortesSagitario);

        txMelhorarSagitario.setColumns(20);
        txMelhorarSagitario.setRows(5);
        txMelhorarSagitario.setText(" Pensar antes de falar, ter mais \n responsabilidade com compromissos \n e evitar decisões precipitadas.");
        jScrollPane26.setViewportView(txMelhorarSagitario);

        javax.swing.GroupLayout areaCaracteristicasSagitarioLayout = new javax.swing.GroupLayout(areaCaracteristicasSagitario);
        areaCaracteristicasSagitario.setLayout(areaCaracteristicasSagitarioLayout);
        areaCaracteristicasSagitarioLayout.setHorizontalGroup(
            areaCaracteristicasSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasSagitarioLayout.createSequentialGroup()
                .addGroup(areaCaracteristicasSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaCaracteristicasSagitarioLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(areaCaracteristicasSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pfortesSagitario)
                            .addComponent(pMelhorarSagitario)))
                    .addGroup(areaCaracteristicasSagitarioLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(tituloCarecteristicasSagitario)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        areaCaracteristicasSagitarioLayout.setVerticalGroup(
            areaCaracteristicasSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasSagitarioLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloCarecteristicasSagitario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pfortesSagitario)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pMelhorarSagitario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        sagitario.add(areaCaracteristicasSagitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 300, 330));

        areaPrevisaoSagitario.setBackground(new java.awt.Color(87, 4, 4));
        areaPrevisaoSagitario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        previsaoSagitario.setFont(new java.awt.Font("Viner Hand ITC", 1, 20)); // NOI18N
        previsaoSagitario.setForeground(new java.awt.Color(255, 255, 255));
        previsaoSagitario.setText("Previsão do Dia:");

        btnAtualizarPrevisaoSagitario.setBackground(new java.awt.Color(255, 255, 204));
        btnAtualizarPrevisaoSagitario.setFont(new java.awt.Font("OCR A Extended", 1, 12)); // NOI18N
        btnAtualizarPrevisaoSagitario.setText("Atualizar Previsão");
        btnAtualizarPrevisaoSagitario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAtualizarPrevisaoSagitario.setPreferredSize(new java.awt.Dimension(157, 32));
        btnAtualizarPrevisaoSagitario.addActionListener(this::btnAtualizarPrevisaoSagitarioActionPerformed);

        txtPrevisaoSagitario.setColumns(20);
        txtPrevisaoSagitario.setRows(5);
        txPrevisaoAries8.setViewportView(txtPrevisaoSagitario);

        javax.swing.GroupLayout areaPrevisaoSagitarioLayout = new javax.swing.GroupLayout(areaPrevisaoSagitario);
        areaPrevisaoSagitario.setLayout(areaPrevisaoSagitarioLayout);
        areaPrevisaoSagitarioLayout.setHorizontalGroup(
            areaPrevisaoSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoSagitarioLayout.createSequentialGroup()
                .addGroup(areaPrevisaoSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisaoSagitarioLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(btnAtualizarPrevisaoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaPrevisaoSagitarioLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(previsaoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaPrevisaoSagitarioLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(txPrevisaoAries8, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        areaPrevisaoSagitarioLayout.setVerticalGroup(
            areaPrevisaoSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoSagitarioLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(previsaoSagitario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txPrevisaoAries8, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnAtualizarPrevisaoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        sagitario.add(areaPrevisaoSagitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 500, 300, 320));

        areaEnergiaSagitario.setBackground(new java.awt.Color(87, 4, 4));
        areaEnergiaSagitario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tituloEnergiaSagitario.setFont(new java.awt.Font("Viner Hand ITC", 1, 20)); // NOI18N
        tituloEnergiaSagitario.setForeground(new java.awt.Color(255, 255, 255));
        tituloEnergiaSagitario.setText("Energia do Dia");

        amorSagitario.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        amorSagitario.setForeground(new java.awt.Color(255, 255, 255));
        amorSagitario.setText("Amor:");

        trabalhoSagitario.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        trabalhoSagitario.setForeground(new java.awt.Color(255, 255, 255));
        trabalhoSagitario.setText("Trabalho:");

        saudeSagitario.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        saudeSagitario.setForeground(new java.awt.Color(255, 255, 255));
        saudeSagitario.setText("Saúde:");

        sorteSagitario.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        sorteSagitario.setForeground(new java.awt.Color(255, 255, 255));
        sorteSagitario.setText("Sorte:");

        tfAmorSagitario.setText("86%");

        tfTrabalhoSagitario.setText("87%");
        tfTrabalhoSagitario.setPreferredSize(new java.awt.Dimension(165, 26));

        tfSaudeSagitario.setText("90%");
        tfSaudeSagitario.setPreferredSize(new java.awt.Dimension(165, 26));

        tfSorteSagitario.setText("93%");
        tfSorteSagitario.setPreferredSize(new java.awt.Dimension(265, 26));

        javax.swing.GroupLayout areaEnergiaSagitarioLayout = new javax.swing.GroupLayout(areaEnergiaSagitario);
        areaEnergiaSagitario.setLayout(areaEnergiaSagitarioLayout);
        areaEnergiaSagitarioLayout.setHorizontalGroup(
            areaEnergiaSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaSagitarioLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(areaEnergiaSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(trabalhoSagitario)
                    .addComponent(amorSagitario)
                    .addComponent(saudeSagitario)
                    .addComponent(sorteSagitario)
                    .addComponent(tfSaudeSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTrabalhoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSorteSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(areaEnergiaSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(tituloEnergiaSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfAmorSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        areaEnergiaSagitarioLayout.setVerticalGroup(
            areaEnergiaSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaSagitarioLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(tituloEnergiaSagitario)
                .addGap(18, 18, 18)
                .addComponent(amorSagitario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(trabalhoSagitario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTrabalhoSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saudeSagitario)
                .addGap(1, 1, 1)
                .addComponent(tfSaudeSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sorteSagitario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSorteSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        sagitario.add(areaEnergiaSagitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 60, 380, 300));

        areaMensagemSagitario.setBackground(new java.awt.Color(87, 4, 4));
        areaMensagemSagitario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tituloMensagemSagitario.setFont(new java.awt.Font("Viner Hand ITC", 1, 20)); // NOI18N
        tituloMensagemSagitario.setForeground(new java.awt.Color(255, 255, 255));
        tituloMensagemSagitario.setText("Mensagem do Dia:");

        txMensagemSagitario.setColumns(20);
        txMensagemSagitario.setRows(5);
        jScrollPane27.setViewportView(txMensagemSagitario);

        btnCopiarMensagemSagitario.setBackground(new java.awt.Color(255, 255, 204));
        btnCopiarMensagemSagitario.setFont(new java.awt.Font("OCR A Extended", 1, 12)); // NOI18N
        btnCopiarMensagemSagitario.setText("Copiar Mensagem");
        btnCopiarMensagemSagitario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCopiarMensagemSagitario.setPreferredSize(new java.awt.Dimension(103, 32));

        javax.swing.GroupLayout areaMensagemSagitarioLayout = new javax.swing.GroupLayout(areaMensagemSagitario);
        areaMensagemSagitario.setLayout(areaMensagemSagitarioLayout);
        areaMensagemSagitarioLayout.setHorizontalGroup(
            areaMensagemSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemSagitarioLayout.createSequentialGroup()
                .addGroup(areaMensagemSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaMensagemSagitarioLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(tituloMensagemSagitario))
                    .addGroup(areaMensagemSagitarioLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaMensagemSagitarioLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(btnCopiarMensagemSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        areaMensagemSagitarioLayout.setVerticalGroup(
            areaMensagemSagitarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemSagitarioLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(tituloMensagemSagitario)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMensagemSagitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        sagitario.add(areaMensagemSagitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 540, 380, 280));

        fundoSagitario.setIcon(new javax.swing.ImageIcon("C:\\Users\\CleicianeGomes\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\all5.png")); // NOI18N
        sagitario.add(fundoSagitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(-210, -30, -1, -1));

        txPrevisaoAquario.addTab("Sagitário", sagitario);

        capricornio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaInformacoesCapricornio.setBackground(new java.awt.Color(87, 4, 4));
        areaInformacoesCapricornio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        imgSignoCapricornio.setIcon(new javax.swing.ImageIcon("C:\\Users\\CleicianeGomes\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\capricornio.jpg")); // NOI18N

        tituloCapricornio.setFont(new java.awt.Font("Viner Hand ITC", 1, 20)); // NOI18N
        tituloCapricornio.setForeground(new java.awt.Color(255, 255, 255));
        tituloCapricornio.setText("Capricórnio");

        periodoCapricornio.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        periodoCapricornio.setForeground(new java.awt.Color(255, 255, 255));
        periodoCapricornio.setText("Periodo:");

        elementoCapricornio.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        elementoCapricornio.setForeground(new java.awt.Color(255, 255, 255));
        elementoCapricornio.setText("Elemento:");

        planetaCapricornio.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        planetaCapricornio.setForeground(new java.awt.Color(255, 255, 255));
        planetaCapricornio.setText("Planeta Regente:");

        corCapricornio.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        corCapricornio.setForeground(new java.awt.Color(255, 255, 255));
        corCapricornio.setText("Cor:");

        numeroCapricornio.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        numeroCapricornio.setForeground(new java.awt.Color(255, 255, 255));
        numeroCapricornio.setText("Número da sorte:");

        tfPeriodoCapricornio.setBackground(new java.awt.Color(255, 255, 204));
        tfPeriodoCapricornio.setText("22/12 a 19/01");

        tfElementoCapricornio.setBackground(new java.awt.Color(255, 255, 204));
        tfElementoCapricornio.setText("Terra");

        tfPlanetaCapricornio.setBackground(new java.awt.Color(255, 255, 204));
        tfPlanetaCapricornio.setText("Saturno");

        tfCorCapricornio.setBackground(new java.awt.Color(255, 255, 204));
        tfCorCapricornio.setText("Marrom");

        tfNumeroCapricornio.setBackground(new java.awt.Color(255, 255, 204));
        tfNumeroCapricornio.setText("4");

        javax.swing.GroupLayout areaInformacoesCapricornioLayout = new javax.swing.GroupLayout(areaInformacoesCapricornio);
        areaInformacoesCapricornio.setLayout(areaInformacoesCapricornioLayout);
        areaInformacoesCapricornioLayout.setHorizontalGroup(
            areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesCapricornioLayout.createSequentialGroup()
                .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgSignoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(areaInformacoesCapricornioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoesCapricornioLayout.createSequentialGroup()
                                .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(periodoCapricornio)
                                    .addComponent(elementoCapricornio))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfPeriodoCapricornio)
                                    .addComponent(tfElementoCapricornio)))
                            .addGroup(areaInformacoesCapricornioLayout.createSequentialGroup()
                                .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(areaInformacoesCapricornioLayout.createSequentialGroup()
                                        .addComponent(corCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfCorCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(areaInformacoesCapricornioLayout.createSequentialGroup()
                                        .addComponent(planetaCapricornio)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfPlanetaCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(areaInformacoesCapricornioLayout.createSequentialGroup()
                                        .addComponent(numeroCapricornio)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfNumeroCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tituloCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 32, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        areaInformacoesCapricornioLayout.setVerticalGroup(
            areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesCapricornioLayout.createSequentialGroup()
                .addComponent(imgSignoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tituloCapricornio)
                .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoesCapricornioLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfElementoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(elementoCapricornio)))
                    .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfPeriodoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(periodoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaCapricornio)
                    .addComponent(tfPlanetaCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corCapricornio)
                    .addComponent(tfCorCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroCapricornio)
                    .addComponent(tfNumeroCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        capricornio.add(areaInformacoesCapricornio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 310, 760));

        areaCaracteristicasCapricornio.setBackground(new java.awt.Color(87, 4, 4));
        areaCaracteristicasCapricornio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tituloCarecteristicasCapricornio.setFont(new java.awt.Font("Viner Hand ITC", 1, 20)); // NOI18N
        tituloCarecteristicasCapricornio.setForeground(new java.awt.Color(255, 255, 255));
        tituloCarecteristicasCapricornio.setText("Características");

        pfortesCapricornio.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        pfortesCapricornio.setForeground(new java.awt.Color(255, 255, 255));
        pfortesCapricornio.setText("Pontos Fortes:");

        pMelhorarCapricornio.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        pMelhorarCapricornio.setForeground(new java.awt.Color(255, 255, 255));
        pMelhorarCapricornio.setText("Pontos a Melhorar:");

        txFortesCapricornio.setColumns(20);
        txFortesCapricornio.setRows(5);
        txFortesCapricornio.setText("Disciplina, responsabilidade, foco e \ndeterminação para alcançar objetivos.");
        jScrollPane28.setViewportView(txFortesCapricornio);

        txMelhorarCapricornio.setColumns(20);
        txMelhorarCapricornio.setRows(5);
        txMelhorarCapricornio.setText(" Evitar o excesso de cobrança, descansar \n mais e permitir-se aproveitar pequenas \n conquistas.");
        jScrollPane29.setViewportView(txMelhorarCapricornio);

        javax.swing.GroupLayout areaCaracteristicasCapricornioLayout = new javax.swing.GroupLayout(areaCaracteristicasCapricornio);
        areaCaracteristicasCapricornio.setLayout(areaCaracteristicasCapricornioLayout);
        areaCaracteristicasCapricornioLayout.setHorizontalGroup(
            areaCaracteristicasCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasCapricornioLayout.createSequentialGroup()
                .addGroup(areaCaracteristicasCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaCaracteristicasCapricornioLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(areaCaracteristicasCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pfortesCapricornio)
                            .addComponent(pMelhorarCapricornio)))
                    .addGroup(areaCaracteristicasCapricornioLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(tituloCarecteristicasCapricornio)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        areaCaracteristicasCapricornioLayout.setVerticalGroup(
            areaCaracteristicasCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasCapricornioLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloCarecteristicasCapricornio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pfortesCapricornio)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pMelhorarCapricornio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        capricornio.add(areaCaracteristicasCapricornio, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 300, 330));

        areaPrevisaoCapricornio.setBackground(new java.awt.Color(87, 4, 4));
        areaPrevisaoCapricornio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        previsaoCapricornio.setFont(new java.awt.Font("Viner Hand ITC", 1, 20)); // NOI18N
        previsaoCapricornio.setForeground(new java.awt.Color(255, 255, 255));
        previsaoCapricornio.setText("Previsão do Dia:");

        btnAtualizarPrevisaoCapricornio.setBackground(new java.awt.Color(255, 255, 204));
        btnAtualizarPrevisaoCapricornio.setFont(new java.awt.Font("OCR A Extended", 1, 12)); // NOI18N
        btnAtualizarPrevisaoCapricornio.setText("Atualizar Previsão");
        btnAtualizarPrevisaoCapricornio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAtualizarPrevisaoCapricornio.setPreferredSize(new java.awt.Dimension(157, 32));
        btnAtualizarPrevisaoCapricornio.addActionListener(this::btnAtualizarPrevisaoCapricornioActionPerformed);

        txtPrevisaoCapricornio.setColumns(20);
        txtPrevisaoCapricornio.setRows(5);
        txPrevisaoAries9.setViewportView(txtPrevisaoCapricornio);

        javax.swing.GroupLayout areaPrevisaoCapricornioLayout = new javax.swing.GroupLayout(areaPrevisaoCapricornio);
        areaPrevisaoCapricornio.setLayout(areaPrevisaoCapricornioLayout);
        areaPrevisaoCapricornioLayout.setHorizontalGroup(
            areaPrevisaoCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoCapricornioLayout.createSequentialGroup()
                .addGroup(areaPrevisaoCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisaoCapricornioLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(btnAtualizarPrevisaoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaPrevisaoCapricornioLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(previsaoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaPrevisaoCapricornioLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(txPrevisaoAries9, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        areaPrevisaoCapricornioLayout.setVerticalGroup(
            areaPrevisaoCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoCapricornioLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(previsaoCapricornio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txPrevisaoAries9, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnAtualizarPrevisaoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        capricornio.add(areaPrevisaoCapricornio, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 500, 300, 320));

        areaEnergiaCapricornio.setBackground(new java.awt.Color(87, 4, 4));
        areaEnergiaCapricornio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tituloEnergiaCapricornio.setFont(new java.awt.Font("Viner Hand ITC", 1, 20)); // NOI18N
        tituloEnergiaCapricornio.setForeground(new java.awt.Color(255, 255, 255));
        tituloEnergiaCapricornio.setText("Energia do Dia");

        amorCapricornio.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        amorCapricornio.setForeground(new java.awt.Color(255, 255, 255));
        amorCapricornio.setText("Amor:");

        trabalhoCapricornio.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        trabalhoCapricornio.setForeground(new java.awt.Color(255, 255, 255));
        trabalhoCapricornio.setText("Trabalho:");

        saudeCapricornio.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        saudeCapricornio.setForeground(new java.awt.Color(255, 255, 255));
        saudeCapricornio.setText("Saúde:");

        sorteCapricornio.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        sorteCapricornio.setForeground(new java.awt.Color(255, 255, 255));
        sorteCapricornio.setText("Sorte:");

        tfAmorCapricornio.setText("78%");

        tfTrabalhoCapricornio.setText("96%");
        tfTrabalhoCapricornio.setPreferredSize(new java.awt.Dimension(165, 26));

        tfSaudeCapricornio.setText("82%");
        tfSaudeCapricornio.setPreferredSize(new java.awt.Dimension(165, 26));

        tfSorteCapricornio.setText("80%");
        tfSorteCapricornio.setPreferredSize(new java.awt.Dimension(265, 26));

        javax.swing.GroupLayout areaEnergiaCapricornioLayout = new javax.swing.GroupLayout(areaEnergiaCapricornio);
        areaEnergiaCapricornio.setLayout(areaEnergiaCapricornioLayout);
        areaEnergiaCapricornioLayout.setHorizontalGroup(
            areaEnergiaCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaCapricornioLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(areaEnergiaCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(trabalhoCapricornio)
                    .addComponent(amorCapricornio)
                    .addComponent(saudeCapricornio)
                    .addComponent(sorteCapricornio)
                    .addComponent(tfSaudeCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTrabalhoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSorteCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(areaEnergiaCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(tituloEnergiaCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfAmorCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        areaEnergiaCapricornioLayout.setVerticalGroup(
            areaEnergiaCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaCapricornioLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(tituloEnergiaCapricornio)
                .addGap(18, 18, 18)
                .addComponent(amorCapricornio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(trabalhoCapricornio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTrabalhoCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saudeCapricornio)
                .addGap(1, 1, 1)
                .addComponent(tfSaudeCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sorteCapricornio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSorteCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        capricornio.add(areaEnergiaCapricornio, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 60, 380, 300));

        areaMensagemCapricornio.setBackground(new java.awt.Color(87, 4, 4));
        areaMensagemCapricornio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tituloMensagemCapricornio.setFont(new java.awt.Font("Viner Hand ITC", 1, 20)); // NOI18N
        tituloMensagemCapricornio.setForeground(new java.awt.Color(255, 255, 255));
        tituloMensagemCapricornio.setText("Mensagem do Dia:");

        txMensagemCapricornio.setColumns(20);
        txMensagemCapricornio.setRows(5);
        jScrollPane30.setViewportView(txMensagemCapricornio);

        btnCopiarMensagemCapricornio.setBackground(new java.awt.Color(255, 255, 204));
        btnCopiarMensagemCapricornio.setFont(new java.awt.Font("OCR A Extended", 1, 12)); // NOI18N
        btnCopiarMensagemCapricornio.setText("Copiar Mensagem");
        btnCopiarMensagemCapricornio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCopiarMensagemCapricornio.setPreferredSize(new java.awt.Dimension(103, 32));

        javax.swing.GroupLayout areaMensagemCapricornioLayout = new javax.swing.GroupLayout(areaMensagemCapricornio);
        areaMensagemCapricornio.setLayout(areaMensagemCapricornioLayout);
        areaMensagemCapricornioLayout.setHorizontalGroup(
            areaMensagemCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemCapricornioLayout.createSequentialGroup()
                .addGroup(areaMensagemCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaMensagemCapricornioLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(tituloMensagemCapricornio))
                    .addGroup(areaMensagemCapricornioLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaMensagemCapricornioLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(btnCopiarMensagemCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        areaMensagemCapricornioLayout.setVerticalGroup(
            areaMensagemCapricornioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemCapricornioLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(tituloMensagemCapricornio)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMensagemCapricornio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        capricornio.add(areaMensagemCapricornio, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 540, 380, 280));

        fundoCapricornio.setIcon(new javax.swing.ImageIcon("C:\\Users\\CleicianeGomes\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\all5.png")); // NOI18N
        capricornio.add(fundoCapricornio, new org.netbeans.lib.awtextra.AbsoluteConstraints(-240, -10, -1, -1));

        txPrevisaoAquario.addTab("Capricórnio", capricornio);

        aquario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaInformacoesAquario.setBackground(new java.awt.Color(87, 4, 4));
        areaInformacoesAquario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        imgSignoAquario.setIcon(new javax.swing.ImageIcon("C:\\Users\\CleicianeGomes\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\aquario.jpg")); // NOI18N

        tituloAquario.setFont(new java.awt.Font("Viner Hand ITC", 1, 20)); // NOI18N
        tituloAquario.setForeground(new java.awt.Color(255, 255, 255));
        tituloAquario.setText("Aquário");

        periodoAquario.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        periodoAquario.setForeground(new java.awt.Color(255, 255, 255));
        periodoAquario.setText("Periodo:");

        elementoAquario.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        elementoAquario.setForeground(new java.awt.Color(255, 255, 255));
        elementoAquario.setText("Elemento:");

        planetaAquario.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        planetaAquario.setForeground(new java.awt.Color(255, 255, 255));
        planetaAquario.setText("Planeta Regente:");

        corAquario.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        corAquario.setForeground(new java.awt.Color(255, 255, 255));
        corAquario.setText("Cor:");

        numeroAquario.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        numeroAquario.setForeground(new java.awt.Color(255, 255, 255));
        numeroAquario.setText("Número da sorte:");

        tfPeriodoAquario.setBackground(new java.awt.Color(255, 255, 204));
        tfPeriodoAquario.setText("20/01 a 18/02");

        tfElementoAquario.setBackground(new java.awt.Color(255, 255, 204));
        tfElementoAquario.setText("Ar");

        tfPlanetaAquario.setBackground(new java.awt.Color(255, 255, 204));
        tfPlanetaAquario.setText("Urano");

        tfCorAquario.setBackground(new java.awt.Color(255, 255, 204));
        tfCorAquario.setText("Azul");

        tfNumeroAquario.setBackground(new java.awt.Color(255, 255, 204));
        tfNumeroAquario.setText("7\n");

        javax.swing.GroupLayout areaInformacoesAquarioLayout = new javax.swing.GroupLayout(areaInformacoesAquario);
        areaInformacoesAquario.setLayout(areaInformacoesAquarioLayout);
        areaInformacoesAquarioLayout.setHorizontalGroup(
            areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesAquarioLayout.createSequentialGroup()
                .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgSignoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(areaInformacoesAquarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoesAquarioLayout.createSequentialGroup()
                                .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(periodoAquario)
                                    .addComponent(elementoAquario))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfPeriodoAquario)
                                    .addComponent(tfElementoAquario)))
                            .addGroup(areaInformacoesAquarioLayout.createSequentialGroup()
                                .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(areaInformacoesAquarioLayout.createSequentialGroup()
                                        .addComponent(corAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfCorAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(areaInformacoesAquarioLayout.createSequentialGroup()
                                        .addComponent(planetaAquario)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfPlanetaAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(areaInformacoesAquarioLayout.createSequentialGroup()
                                        .addComponent(numeroAquario)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfNumeroAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tituloAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 32, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        areaInformacoesAquarioLayout.setVerticalGroup(
            areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesAquarioLayout.createSequentialGroup()
                .addComponent(imgSignoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tituloAquario)
                .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoesAquarioLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(elementoAquario)
                            .addComponent(tfElementoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfPeriodoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(periodoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaAquario)
                    .addComponent(tfPlanetaAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corAquario)
                    .addComponent(tfCorAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroAquario)
                    .addComponent(tfNumeroAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        aquario.add(areaInformacoesAquario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 310, 760));

        areaCaracteristicasAquario.setBackground(new java.awt.Color(87, 4, 4));
        areaCaracteristicasAquario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tituloCarecteristicasAquario.setFont(new java.awt.Font("Viner Hand ITC", 1, 20)); // NOI18N
        tituloCarecteristicasAquario.setForeground(new java.awt.Color(255, 255, 255));
        tituloCarecteristicasAquario.setText("Características");

        pfortesAquario.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        pfortesAquario.setForeground(new java.awt.Color(255, 255, 255));
        pfortesAquario.setText("Pontos Fortes:");

        pMelhorarAquario.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        pMelhorarAquario.setForeground(new java.awt.Color(255, 255, 255));
        pMelhorarAquario.setText("Pontos a Melhorar:");

        txFortesAquario.setColumns(20);
        txFortesAquario.setRows(5);
        txFortesAquario.setText(" Originalidade, criatividade, \n independência e facilidade para \n pensar de maneira diferente.");
        jScrollPane31.setViewportView(txFortesAquario);

        txMelhorarAquario.setColumns(20);
        txMelhorarAquario.setRows(5);
        txMelhorarAquario.setText(" Ter mais paciência com os outros, \n demonstrar sentimentos e aceitar \n diferentes perspectivas.");
        jScrollPane32.setViewportView(txMelhorarAquario);

        javax.swing.GroupLayout areaCaracteristicasAquarioLayout = new javax.swing.GroupLayout(areaCaracteristicasAquario);
        areaCaracteristicasAquario.setLayout(areaCaracteristicasAquarioLayout);
        areaCaracteristicasAquarioLayout.setHorizontalGroup(
            areaCaracteristicasAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasAquarioLayout.createSequentialGroup()
                .addGroup(areaCaracteristicasAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaCaracteristicasAquarioLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(areaCaracteristicasAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pfortesAquario)
                            .addComponent(pMelhorarAquario)))
                    .addGroup(areaCaracteristicasAquarioLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(tituloCarecteristicasAquario)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        areaCaracteristicasAquarioLayout.setVerticalGroup(
            areaCaracteristicasAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasAquarioLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloCarecteristicasAquario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pfortesAquario)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pMelhorarAquario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        aquario.add(areaCaracteristicasAquario, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 300, 330));

        areaPrevisaoAquario.setBackground(new java.awt.Color(87, 4, 4));
        areaPrevisaoAquario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        previsaoAquario.setFont(new java.awt.Font("Viner Hand ITC", 1, 20)); // NOI18N
        previsaoAquario.setForeground(new java.awt.Color(255, 255, 255));
        previsaoAquario.setText("Previsão do Dia:");

        btnAtualizarPrevsaoAquario.setBackground(new java.awt.Color(255, 255, 204));
        btnAtualizarPrevsaoAquario.setFont(new java.awt.Font("OCR A Extended", 1, 12)); // NOI18N
        btnAtualizarPrevsaoAquario.setText("Atualizar Previsão");
        btnAtualizarPrevsaoAquario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAtualizarPrevsaoAquario.setPreferredSize(new java.awt.Dimension(157, 32));
        btnAtualizarPrevsaoAquario.addActionListener(this::btnAtualizarPrevsaoAquarioActionPerformed);

        txtPrevisaoAquarios.setColumns(20);
        txtPrevisaoAquarios.setRows(5);
        txPrevisaoAries10.setViewportView(txtPrevisaoAquarios);

        javax.swing.GroupLayout areaPrevisaoAquarioLayout = new javax.swing.GroupLayout(areaPrevisaoAquario);
        areaPrevisaoAquario.setLayout(areaPrevisaoAquarioLayout);
        areaPrevisaoAquarioLayout.setHorizontalGroup(
            areaPrevisaoAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoAquarioLayout.createSequentialGroup()
                .addGroup(areaPrevisaoAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisaoAquarioLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(btnAtualizarPrevsaoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaPrevisaoAquarioLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(previsaoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaPrevisaoAquarioLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(txPrevisaoAries10, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        areaPrevisaoAquarioLayout.setVerticalGroup(
            areaPrevisaoAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoAquarioLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(previsaoAquario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txPrevisaoAries10, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnAtualizarPrevsaoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        aquario.add(areaPrevisaoAquario, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 500, 300, 320));

        areaEnergiaAquario.setBackground(new java.awt.Color(87, 4, 4));
        areaEnergiaAquario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tituloEnergiaAquario.setFont(new java.awt.Font("Viner Hand ITC", 1, 20)); // NOI18N
        tituloEnergiaAquario.setForeground(new java.awt.Color(255, 255, 255));
        tituloEnergiaAquario.setText("Energia do Dia");

        amorAquario.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        amorAquario.setForeground(new java.awt.Color(255, 255, 255));
        amorAquario.setText("Amor:");

        trabalhoAquario.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        trabalhoAquario.setForeground(new java.awt.Color(255, 255, 255));
        trabalhoAquario.setText("Trabalho:");

        saudeAquario.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        saudeAquario.setForeground(new java.awt.Color(255, 255, 255));
        saudeAquario.setText("Saúde:");

        sorteAquario.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        sorteAquario.setForeground(new java.awt.Color(255, 255, 255));
        sorteAquario.setText("Sorte:");

        tfAmorAquario.setText("81%");

        tfTrabalhoAquario.setText("92%");
        tfTrabalhoAquario.setPreferredSize(new java.awt.Dimension(165, 26));

        tfSaudeAquario.setText("76%");
        tfSaudeAquario.setPreferredSize(new java.awt.Dimension(165, 26));

        tfSorteAquario.setText("88%");
        tfSorteAquario.setPreferredSize(new java.awt.Dimension(265, 26));

        javax.swing.GroupLayout areaEnergiaAquarioLayout = new javax.swing.GroupLayout(areaEnergiaAquario);
        areaEnergiaAquario.setLayout(areaEnergiaAquarioLayout);
        areaEnergiaAquarioLayout.setHorizontalGroup(
            areaEnergiaAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaAquarioLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(areaEnergiaAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(trabalhoAquario)
                    .addComponent(amorAquario)
                    .addComponent(saudeAquario)
                    .addComponent(sorteAquario)
                    .addComponent(tfSaudeAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTrabalhoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSorteAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(areaEnergiaAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(tituloEnergiaAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfAmorAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        areaEnergiaAquarioLayout.setVerticalGroup(
            areaEnergiaAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaAquarioLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(tituloEnergiaAquario)
                .addGap(18, 18, 18)
                .addComponent(amorAquario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(trabalhoAquario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTrabalhoAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saudeAquario)
                .addGap(1, 1, 1)
                .addComponent(tfSaudeAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sorteAquario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSorteAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        aquario.add(areaEnergiaAquario, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 60, 380, 300));

        areaMensagemAquario.setBackground(new java.awt.Color(87, 4, 4));
        areaMensagemAquario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tituloMensagemAquario.setFont(new java.awt.Font("Viner Hand ITC", 1, 20)); // NOI18N
        tituloMensagemAquario.setForeground(new java.awt.Color(255, 255, 255));
        tituloMensagemAquario.setText("Mensagem do Dia:");

        txMensagemAquario.setColumns(20);
        txMensagemAquario.setRows(5);
        jScrollPane33.setViewportView(txMensagemAquario);

        btnCopiarMensagemAquario.setBackground(new java.awt.Color(255, 255, 204));
        btnCopiarMensagemAquario.setFont(new java.awt.Font("OCR A Extended", 1, 12)); // NOI18N
        btnCopiarMensagemAquario.setText("Copiar Mensagem");
        btnCopiarMensagemAquario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCopiarMensagemAquario.setPreferredSize(new java.awt.Dimension(103, 32));

        javax.swing.GroupLayout areaMensagemAquarioLayout = new javax.swing.GroupLayout(areaMensagemAquario);
        areaMensagemAquario.setLayout(areaMensagemAquarioLayout);
        areaMensagemAquarioLayout.setHorizontalGroup(
            areaMensagemAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemAquarioLayout.createSequentialGroup()
                .addGroup(areaMensagemAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaMensagemAquarioLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(tituloMensagemAquario))
                    .addGroup(areaMensagemAquarioLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jScrollPane33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaMensagemAquarioLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(btnCopiarMensagemAquario, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        areaMensagemAquarioLayout.setVerticalGroup(
            areaMensagemAquarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemAquarioLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(tituloMensagemAquario)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane33, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMensagemAquario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        aquario.add(areaMensagemAquario, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 540, 380, 280));

        fundoAquario.setIcon(new javax.swing.ImageIcon("C:\\Users\\CleicianeGomes\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\all5.png")); // NOI18N
        aquario.add(fundoAquario, new org.netbeans.lib.awtextra.AbsoluteConstraints(-210, -10, 1440, -1));

        txPrevisaoAquario.addTab("Aquário", aquario);

        peixes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaInformacoesPeixes.setBackground(new java.awt.Color(87, 4, 4));
        areaInformacoesPeixes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        imgSignoPeixes.setIcon(new javax.swing.ImageIcon("C:\\Users\\CleicianeGomes\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\peixes2.jpg")); // NOI18N

        tituloPeixes.setFont(new java.awt.Font("Viner Hand ITC", 1, 20)); // NOI18N
        tituloPeixes.setForeground(new java.awt.Color(255, 255, 255));
        tituloPeixes.setText("Peixes");

        periodoPeixes.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        periodoPeixes.setForeground(new java.awt.Color(255, 255, 255));
        periodoPeixes.setText("Periodo:");

        elementoPeixes.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        elementoPeixes.setForeground(new java.awt.Color(255, 255, 255));
        elementoPeixes.setText("Elemento:");

        planetaPeixes.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        planetaPeixes.setForeground(new java.awt.Color(255, 255, 255));
        planetaPeixes.setText("Planeta Regente:");

        corPeixes.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        corPeixes.setForeground(new java.awt.Color(255, 255, 255));
        corPeixes.setText("Cor:");

        numeroPeixes.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        numeroPeixes.setForeground(new java.awt.Color(255, 255, 255));
        numeroPeixes.setText("Número da sorte:");

        tfPeriodoPeixes.setBackground(new java.awt.Color(255, 255, 204));
        tfPeriodoPeixes.setText("19/02 a 20/03");

        tfElementoPeixes.setBackground(new java.awt.Color(255, 255, 204));
        tfElementoPeixes.setText("Água");

        tfPlanetaPeixes.setBackground(new java.awt.Color(255, 255, 204));
        tfPlanetaPeixes.setText("Netuno");

        tfCorPeixes.setBackground(new java.awt.Color(255, 255, 204));
        tfCorPeixes.setText("Lilás");

        tfNumeroPeixes.setBackground(new java.awt.Color(255, 255, 204));
        tfNumeroPeixes.setText("7\n");

        javax.swing.GroupLayout areaInformacoesPeixesLayout = new javax.swing.GroupLayout(areaInformacoesPeixes);
        areaInformacoesPeixes.setLayout(areaInformacoesPeixesLayout);
        areaInformacoesPeixesLayout.setHorizontalGroup(
            areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesPeixesLayout.createSequentialGroup()
                .addGroup(areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgSignoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(areaInformacoesPeixesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(areaInformacoesPeixesLayout.createSequentialGroup()
                                .addGroup(areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(periodoPeixes)
                                    .addComponent(elementoPeixes))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfPeriodoPeixes)
                                    .addComponent(tfElementoPeixes)))
                            .addGroup(areaInformacoesPeixesLayout.createSequentialGroup()
                                .addGroup(areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(areaInformacoesPeixesLayout.createSequentialGroup()
                                        .addComponent(corPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfCorPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(areaInformacoesPeixesLayout.createSequentialGroup()
                                        .addComponent(planetaPeixes)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfPlanetaPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(areaInformacoesPeixesLayout.createSequentialGroup()
                                        .addComponent(numeroPeixes)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfNumeroPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tituloPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 32, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        areaInformacoesPeixesLayout.setVerticalGroup(
            areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaInformacoesPeixesLayout.createSequentialGroup()
                .addComponent(imgSignoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tituloPeixes)
                .addGroup(areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaInformacoesPeixesLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(elementoPeixes)
                            .addComponent(tfElementoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfPeriodoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(periodoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planetaPeixes)
                    .addComponent(tfPlanetaPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corPeixes)
                    .addComponent(tfCorPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(areaInformacoesPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroPeixes)
                    .addComponent(tfNumeroPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        peixes.add(areaInformacoesPeixes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 310, 760));

        areaCaracteristicasPeixes.setBackground(new java.awt.Color(87, 4, 4));
        areaCaracteristicasPeixes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tituloCarecteristicasPeixes.setFont(new java.awt.Font("Viner Hand ITC", 1, 20)); // NOI18N
        tituloCarecteristicasPeixes.setForeground(new java.awt.Color(255, 255, 255));
        tituloCarecteristicasPeixes.setText("Características");

        pfortesPeixes.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        pfortesPeixes.setForeground(new java.awt.Color(255, 255, 255));
        pfortesPeixes.setText("Pontos Fortes:");

        pMelhorarPeixes.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        pMelhorarPeixes.setForeground(new java.awt.Color(255, 255, 255));
        pMelhorarPeixes.setText("Pontos a Melhorar:");

        txFortesPeixes.setColumns(20);
        txFortesPeixes.setRows(5);
        txFortesPeixes.setText(" Imaginação, empatia, criatividade e \n sensibilidade para compreender outras \n pessoas.");
        jScrollPane34.setViewportView(txFortesPeixes);

        txMelhorarPeixes.setColumns(20);
        txMelhorarPeixes.setRows(5);
        txMelhorarPeixes.setText(" Evitar fugir dos problemas, estabelecer \n limites e não deixar que as emoções \n controlem todas as decisões.");
        jScrollPane35.setViewportView(txMelhorarPeixes);

        javax.swing.GroupLayout areaCaracteristicasPeixesLayout = new javax.swing.GroupLayout(areaCaracteristicasPeixes);
        areaCaracteristicasPeixes.setLayout(areaCaracteristicasPeixesLayout);
        areaCaracteristicasPeixesLayout.setHorizontalGroup(
            areaCaracteristicasPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasPeixesLayout.createSequentialGroup()
                .addGroup(areaCaracteristicasPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaCaracteristicasPeixesLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(areaCaracteristicasPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pfortesPeixes)
                            .addComponent(pMelhorarPeixes)))
                    .addGroup(areaCaracteristicasPeixesLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(tituloCarecteristicasPeixes)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        areaCaracteristicasPeixesLayout.setVerticalGroup(
            areaCaracteristicasPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaCaracteristicasPeixesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloCarecteristicasPeixes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pfortesPeixes)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pMelhorarPeixes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        peixes.add(areaCaracteristicasPeixes, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 300, 330));

        areaPrevisaoPeixes.setBackground(new java.awt.Color(87, 4, 4));
        areaPrevisaoPeixes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        previsaoPeixes.setFont(new java.awt.Font("Viner Hand ITC", 1, 20)); // NOI18N
        previsaoPeixes.setForeground(new java.awt.Color(255, 255, 255));
        previsaoPeixes.setText("Previsão do Dia:");

        btnAtualizarPrevsaoPeixes.setBackground(new java.awt.Color(255, 255, 204));
        btnAtualizarPrevsaoPeixes.setFont(new java.awt.Font("OCR A Extended", 1, 12)); // NOI18N
        btnAtualizarPrevsaoPeixes.setText("Atualizar Previsão");
        btnAtualizarPrevsaoPeixes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAtualizarPrevsaoPeixes.setPreferredSize(new java.awt.Dimension(157, 32));
        btnAtualizarPrevsaoPeixes.addActionListener(this::btnAtualizarPrevsaoPeixesActionPerformed);

        txtPrevisaoPeixes.setColumns(20);
        txtPrevisaoPeixes.setRows(5);
        txPrevisaoAries11.setViewportView(txtPrevisaoPeixes);

        javax.swing.GroupLayout areaPrevisaoPeixesLayout = new javax.swing.GroupLayout(areaPrevisaoPeixes);
        areaPrevisaoPeixes.setLayout(areaPrevisaoPeixesLayout);
        areaPrevisaoPeixesLayout.setHorizontalGroup(
            areaPrevisaoPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoPeixesLayout.createSequentialGroup()
                .addGroup(areaPrevisaoPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaPrevisaoPeixesLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(btnAtualizarPrevsaoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaPrevisaoPeixesLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(previsaoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaPrevisaoPeixesLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(txPrevisaoAries11, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        areaPrevisaoPeixesLayout.setVerticalGroup(
            areaPrevisaoPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaPrevisaoPeixesLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(previsaoPeixes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txPrevisaoAries11, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnAtualizarPrevsaoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        peixes.add(areaPrevisaoPeixes, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 490, 300, 320));

        areaEnergiaPeixes.setBackground(new java.awt.Color(87, 4, 4));
        areaEnergiaPeixes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tituloEnergiaPeixes.setFont(new java.awt.Font("Viner Hand ITC", 1, 20)); // NOI18N
        tituloEnergiaPeixes.setForeground(new java.awt.Color(255, 255, 255));
        tituloEnergiaPeixes.setText("Energia do Dia");

        amorPeixes.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        amorPeixes.setForeground(new java.awt.Color(255, 255, 255));
        amorPeixes.setText("Amor:");

        trabalhoPeixes.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        trabalhoPeixes.setForeground(new java.awt.Color(255, 255, 255));
        trabalhoPeixes.setText("Trabalho:");

        saudePeixes.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        saudePeixes.setForeground(new java.awt.Color(255, 255, 255));
        saudePeixes.setText("Saúde:");

        sortePeixes.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        sortePeixes.setForeground(new java.awt.Color(255, 255, 255));
        sortePeixes.setText("Sorte:");

        tfAmorPeixes.setText("93%");

        tfTrabalhoPeixes.setText("79%");
        tfTrabalhoPeixes.setPreferredSize(new java.awt.Dimension(165, 26));

        tfSaudePeixes.setPreferredSize(new java.awt.Dimension(165, 26));

        tfSortePeixes.setPreferredSize(new java.awt.Dimension(265, 26));

        javax.swing.GroupLayout areaEnergiaPeixesLayout = new javax.swing.GroupLayout(areaEnergiaPeixes);
        areaEnergiaPeixes.setLayout(areaEnergiaPeixesLayout);
        areaEnergiaPeixesLayout.setHorizontalGroup(
            areaEnergiaPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaPeixesLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(areaEnergiaPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(trabalhoPeixes)
                    .addComponent(amorPeixes)
                    .addComponent(saudePeixes)
                    .addComponent(sortePeixes)
                    .addComponent(tfSaudePeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTrabalhoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSortePeixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(areaEnergiaPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(tituloEnergiaPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfAmorPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        areaEnergiaPeixesLayout.setVerticalGroup(
            areaEnergiaPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaEnergiaPeixesLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(tituloEnergiaPeixes)
                .addGap(18, 18, 18)
                .addComponent(amorPeixes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAmorPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(trabalhoPeixes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTrabalhoPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saudePeixes)
                .addGap(1, 1, 1)
                .addComponent(tfSaudePeixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sortePeixes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSortePeixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        peixes.add(areaEnergiaPeixes, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 60, 380, 300));

        areaMensagemPeixes.setBackground(new java.awt.Color(87, 4, 4));
        areaMensagemPeixes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tituloMensagemPeixes.setFont(new java.awt.Font("Viner Hand ITC", 1, 20)); // NOI18N
        tituloMensagemPeixes.setForeground(new java.awt.Color(255, 255, 255));
        tituloMensagemPeixes.setText("Mensagem do Dia:");

        txMensagemPeixes.setColumns(20);
        txMensagemPeixes.setRows(5);
        jScrollPane36.setViewportView(txMensagemPeixes);

        btnCopiarMensagemPeixes.setBackground(new java.awt.Color(255, 255, 204));
        btnCopiarMensagemPeixes.setFont(new java.awt.Font("OCR A Extended", 1, 12)); // NOI18N
        btnCopiarMensagemPeixes.setText("Copiar Mensagem");
        btnCopiarMensagemPeixes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCopiarMensagemPeixes.setPreferredSize(new java.awt.Dimension(103, 32));

        javax.swing.GroupLayout areaMensagemPeixesLayout = new javax.swing.GroupLayout(areaMensagemPeixes);
        areaMensagemPeixes.setLayout(areaMensagemPeixesLayout);
        areaMensagemPeixesLayout.setHorizontalGroup(
            areaMensagemPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemPeixesLayout.createSequentialGroup()
                .addGroup(areaMensagemPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(areaMensagemPeixesLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(tituloMensagemPeixes))
                    .addGroup(areaMensagemPeixesLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jScrollPane36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(areaMensagemPeixesLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(btnCopiarMensagemPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        areaMensagemPeixesLayout.setVerticalGroup(
            areaMensagemPeixesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaMensagemPeixesLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(tituloMensagemPeixes)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane36, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCopiarMensagemPeixes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        peixes.add(areaMensagemPeixes, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 540, 380, 280));

        fundoPeixes.setIcon(new javax.swing.ImageIcon("C:\\Users\\CleicianeGomes\\Documents\\ProjetoAppHoroscopo\\Horoscopo\\src\\main\\resources\\assets\\all5.png")); // NOI18N
        peixes.add(fundoPeixes, new org.netbeans.lib.awtextra.AbsoluteConstraints(-270, -30, 1670, 950));

        txPrevisaoAquario.addTab("Peixes", peixes);

        getContentPane().add(txPrevisaoAquario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1670, 988));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbDiaActionPerformed

    private void cbSigno2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSigno2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSigno2ActionPerformed

    private void cbMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMesActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        CalcularCompatibilidade();
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnAtualizarPrevisaoAriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarPrevisaoAriesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtualizarPrevisaoAriesActionPerformed

    private void btnAtualizarPrevisaoTouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarPrevisaoTouroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtualizarPrevisaoTouroActionPerformed

    private void btnAtualizarPrevisaoGemeosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarPrevisaoGemeosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtualizarPrevisaoGemeosActionPerformed

    private void btnAtualizarPrevisaoCancerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarPrevisaoCancerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtualizarPrevisaoCancerActionPerformed

    private void btnAtualizarPrevisaoLeaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarPrevisaoLeaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtualizarPrevisaoLeaoActionPerformed

    private void btnAtualizarPrevisaoVirgemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarPrevisaoVirgemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtualizarPrevisaoVirgemActionPerformed

    private void btnAtualizarPrevisaoLibraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarPrevisaoLibraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtualizarPrevisaoLibraActionPerformed

    private void btnAtualizarPrevisaoEscorpiaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarPrevisaoEscorpiaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtualizarPrevisaoEscorpiaoActionPerformed

    private void btnAtualizarPrevisaoSagitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarPrevisaoSagitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtualizarPrevisaoSagitarioActionPerformed

    private void btnAtualizarPrevisaoCapricornioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarPrevisaoCapricornioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtualizarPrevisaoCapricornioActionPerformed

    private void btnAtualizarPrevsaoAquarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarPrevsaoAquarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtualizarPrevsaoAquarioActionPerformed

    private void btnAtualizarPrevsaoPeixesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarPrevsaoPeixesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtualizarPrevsaoPeixesActionPerformed

    private void tfElementoAriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfElementoAriesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfElementoAriesActionPerformed

    private void tfAmorAriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAmorAriesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAmorAriesActionPerformed

    private void tfSorteAriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSorteAriesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSorteAriesActionPerformed

    private void tfSaudeAriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSaudeAriesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSaudeAriesActionPerformed

    private void tfNumeroTouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNumeroTouroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNumeroTouroActionPerformed

    private void tfTrabalhoTouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTrabalhoTouroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTrabalhoTouroActionPerformed

    private void tfSorteTouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSorteTouroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSorteTouroActionPerformed

    private void tfAmorGemeosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAmorGemeosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAmorGemeosActionPerformed

    private void tfPlanetaCancerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPlanetaCancerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPlanetaCancerActionPerformed

    private void tfCorCancerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCorCancerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCorCancerActionPerformed

    private void tfNumeroCancerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNumeroCancerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNumeroCancerActionPerformed

    private void tfAmorCancerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAmorCancerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAmorCancerActionPerformed

    private void tfSaudeCancerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSaudeCancerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSaudeCancerActionPerformed

    private void tfElementoLeaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfElementoLeaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfElementoLeaoActionPerformed

    private void tfPlanetaLeaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPlanetaLeaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPlanetaLeaoActionPerformed

    private void tfCorLeaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCorLeaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCorLeaoActionPerformed

    private void tfSaudeLeaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSaudeLeaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSaudeLeaoActionPerformed

    private void tfPeriodoVirgemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPeriodoVirgemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPeriodoVirgemActionPerformed

    private void tfNumeroVirgemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNumeroVirgemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNumeroVirgemActionPerformed

    private void tfAmorVirgemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAmorVirgemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAmorVirgemActionPerformed

    private void tfAmorLibraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAmorLibraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAmorLibraActionPerformed

    private void tfCorSagitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCorSagitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCorSagitarioActionPerformed

    private void btnDescobrirSignoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescobrirSignoActionPerformed
        // TODO add your handling code here:
        CalcularSigno();
    }//GEN-LAST:event_btnDescobrirSignoActionPerformed

    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayActionPerformed
        // TODO add your handling code here:
        TocarMusica();
    }//GEN-LAST:event_btnPlayActionPerformed

    private void btnPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPauseActionPerformed
        // TODO add your handling code here:
        PausarMusica();
    }//GEN-LAST:event_btnPauseActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Signos().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amorAquario;
    private javax.swing.JLabel amorAries;
    private javax.swing.JLabel amorCancer;
    private javax.swing.JLabel amorCapricornio;
    private javax.swing.JLabel amorEscorpiao;
    private javax.swing.JLabel amorGemeos;
    private javax.swing.JLabel amorLeao;
    private javax.swing.JLabel amorLibra;
    private javax.swing.JLabel amorPeixes;
    private javax.swing.JLabel amorSagitario;
    private javax.swing.JLabel amorTouro;
    private javax.swing.JLabel amorVirgem;
    private javax.swing.JPanel aquario;
    private javax.swing.JPanel areaCaracteristicasAquario;
    private javax.swing.JPanel areaCaracteristicasAries;
    private javax.swing.JPanel areaCaracteristicasCancer;
    private javax.swing.JPanel areaCaracteristicasCapricornio;
    private javax.swing.JPanel areaCaracteristicasEscorpiao;
    private javax.swing.JPanel areaCaracteristicasGemeos;
    private javax.swing.JPanel areaCaracteristicasLeao;
    private javax.swing.JPanel areaCaracteristicasLibra;
    private javax.swing.JPanel areaCaracteristicasPeixes;
    private javax.swing.JPanel areaCaracteristicasSagitario;
    private javax.swing.JPanel areaCaracteristicasTouro;
    private javax.swing.JPanel areaCaracteristicasVirgem;
    private javax.swing.JPanel areaCompatibilidade;
    private javax.swing.JPanel areaDescobrirSigno;
    private javax.swing.JPanel areaEnergia;
    private javax.swing.JPanel areaEnergiaAquario;
    private javax.swing.JPanel areaEnergiaCancer;
    private javax.swing.JPanel areaEnergiaCapricornio;
    private javax.swing.JPanel areaEnergiaEscorpiao;
    private javax.swing.JPanel areaEnergiaGemeos;
    private javax.swing.JPanel areaEnergiaLeao;
    private javax.swing.JPanel areaEnergiaLibra;
    private javax.swing.JPanel areaEnergiaPeixes;
    private javax.swing.JPanel areaEnergiaSagitario;
    private javax.swing.JPanel areaEnergiaTouro;
    private javax.swing.JPanel areaEnergiaVirgem;
    private javax.swing.JPanel areaInformacaoTouro;
    private javax.swing.JPanel areaInformacoes;
    private javax.swing.JPanel areaInformacoesAquario;
    private javax.swing.JPanel areaInformacoesCancer;
    private javax.swing.JPanel areaInformacoesCapricornio;
    private javax.swing.JPanel areaInformacoesEscorpiao;
    private javax.swing.JPanel areaInformacoesGemeos;
    private javax.swing.JPanel areaInformacoesLeao;
    private javax.swing.JPanel areaInformacoesLibra;
    private javax.swing.JPanel areaInformacoesPeixes;
    private javax.swing.JPanel areaInformacoesSagitario;
    private javax.swing.JPanel areaInformacoesVirgem;
    private javax.swing.JPanel areaMensagem;
    private javax.swing.JPanel areaMensagemAquario;
    private javax.swing.JPanel areaMensagemCancer;
    private javax.swing.JPanel areaMensagemCapricornio;
    private javax.swing.JPanel areaMensagemEscorpiao;
    private javax.swing.JPanel areaMensagemGemeos;
    private javax.swing.JPanel areaMensagemLeao;
    private javax.swing.JPanel areaMensagemLibra;
    private javax.swing.JPanel areaMensagemPeixes;
    private javax.swing.JPanel areaMensagemSagitario;
    private javax.swing.JPanel areaMensagemTouro;
    private javax.swing.JPanel areaMensagemVirgem;
    private javax.swing.JPanel areaPrevisaoAquario;
    private javax.swing.JPanel areaPrevisaoAries;
    private javax.swing.JPanel areaPrevisaoCancer;
    private javax.swing.JPanel areaPrevisaoCapricornio;
    private javax.swing.JPanel areaPrevisaoEscorpiao;
    private javax.swing.JPanel areaPrevisaoGemeos;
    private javax.swing.JPanel areaPrevisaoLeao;
    private javax.swing.JPanel areaPrevisaoLibra;
    private javax.swing.JPanel areaPrevisaoPeixes;
    private javax.swing.JPanel areaPrevisaoSagitario;
    private javax.swing.JPanel areaPrevisaoTouro;
    private javax.swing.JPanel areaPrevisaoVirgem;
    private javax.swing.JPanel areaResultado;
    private javax.swing.JPanel aries;
    private javax.swing.JButton btnAtualizarPrevisaoAries;
    private javax.swing.JButton btnAtualizarPrevisaoCancer;
    private javax.swing.JButton btnAtualizarPrevisaoCapricornio;
    private javax.swing.JButton btnAtualizarPrevisaoEscorpiao;
    private javax.swing.JButton btnAtualizarPrevisaoGemeos;
    private javax.swing.JButton btnAtualizarPrevisaoLeao;
    private javax.swing.JButton btnAtualizarPrevisaoLibra;
    private javax.swing.JButton btnAtualizarPrevisaoSagitario;
    private javax.swing.JButton btnAtualizarPrevisaoTouro;
    private javax.swing.JButton btnAtualizarPrevisaoVirgem;
    private javax.swing.JButton btnAtualizarPrevsaoAquario;
    private javax.swing.JButton btnAtualizarPrevsaoPeixes;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCopiarMensagemAquario;
    private javax.swing.JButton btnCopiarMensagemAries;
    private javax.swing.JButton btnCopiarMensagemCancer;
    private javax.swing.JButton btnCopiarMensagemCapricornio;
    private javax.swing.JButton btnCopiarMensagemEscorpiao;
    private javax.swing.JButton btnCopiarMensagemGemeos;
    private javax.swing.JButton btnCopiarMensagemLeao;
    private javax.swing.JButton btnCopiarMensagemLibra;
    private javax.swing.JButton btnCopiarMensagemPeixes;
    private javax.swing.JButton btnCopiarMensagemSagitario;
    private javax.swing.JButton btnCopiarMensagemTouro;
    private javax.swing.JButton btnCopiarMensagemVirgem;
    private javax.swing.JButton btnDescobrirSigno;
    private javax.swing.JButton btnPause;
    private javax.swing.JButton btnPlay;
    private javax.swing.JButton btnSigno;
    private javax.swing.JPanel cancer;
    private javax.swing.JPanel capricornio;
    private javax.swing.JComboBox<String> cbDia;
    private javax.swing.JComboBox<String> cbMes;
    private javax.swing.JComboBox<String> cbSigno1;
    private javax.swing.JComboBox<String> cbSigno2;
    private javax.swing.JLabel compatibilidade;
    private javax.swing.JLabel corAquario;
    private javax.swing.JLabel corAries;
    private javax.swing.JLabel corCancer;
    private javax.swing.JLabel corCapricornio;
    private javax.swing.JLabel corEscorpiao;
    private javax.swing.JLabel corGemeos;
    private javax.swing.JLabel corLeao;
    private javax.swing.JLabel corLibra;
    private javax.swing.JLabel corPeixes;
    private javax.swing.JLabel corSagitario;
    private javax.swing.JLabel corTouro;
    private javax.swing.JLabel corVirgem;
    private javax.swing.JLabel diaNascimento;
    private javax.swing.JLabel elementoAquario;
    private javax.swing.JLabel elementoAries;
    private javax.swing.JLabel elementoCancer;
    private javax.swing.JLabel elementoCapricornio;
    private javax.swing.JLabel elementoEscorpiao;
    private javax.swing.JLabel elementoGemeos;
    private javax.swing.JLabel elementoLeao;
    private javax.swing.JLabel elementoLibra;
    private javax.swing.JLabel elementoPeixes;
    private javax.swing.JLabel elementoSagitario;
    private javax.swing.JLabel elementoTouro;
    private javax.swing.JLabel elementoVirgem;
    private javax.swing.JPanel escorpião;
    private javax.swing.JLabel fundoAquario;
    private javax.swing.JLabel fundoAries;
    private javax.swing.JLabel fundoCancer;
    private javax.swing.JLabel fundoCapricornio;
    private javax.swing.JLabel fundoEscorpiao;
    private javax.swing.JLabel fundoGemeos;
    private javax.swing.JLabel fundoInicio;
    private javax.swing.JLabel fundoLeao;
    private javax.swing.JLabel fundoLibra;
    private javax.swing.JLabel fundoPeixes;
    private javax.swing.JLabel fundoSagitario;
    private javax.swing.JLabel fundoTouro;
    private javax.swing.JLabel fundoVirgem;
    private javax.swing.JPanel gemeos;
    private javax.swing.JLabel imgSignoAquario;
    private javax.swing.JLabel imgSignoAries;
    private javax.swing.JLabel imgSignoCancer;
    private javax.swing.JLabel imgSignoCapricornio;
    private javax.swing.JLabel imgSignoEscorpiao;
    private javax.swing.JLabel imgSignoGemeos;
    private javax.swing.JLabel imgSignoLeao;
    private javax.swing.JLabel imgSignoLibra;
    private javax.swing.JLabel imgSignoPeixes;
    private javax.swing.JLabel imgSignoSagitario;
    private javax.swing.JLabel imgSignoTouro;
    private javax.swing.JLabel imgSignoVirgem;
    private javax.swing.JPanel inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JScrollPane jScrollPane31;
    private javax.swing.JScrollPane jScrollPane32;
    private javax.swing.JScrollPane jScrollPane33;
    private javax.swing.JScrollPane jScrollPane34;
    private javax.swing.JScrollPane jScrollPane35;
    private javax.swing.JScrollPane jScrollPane36;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JPanel leao;
    private javax.swing.JPanel libra;
    private javax.swing.JLabel mesNascimento;
    private javax.swing.JLabel numeroAquario;
    private javax.swing.JLabel numeroAries;
    private javax.swing.JLabel numeroCancer;
    private javax.swing.JLabel numeroCapricornio;
    private javax.swing.JLabel numeroEscorpiao;
    private javax.swing.JLabel numeroGemeos;
    private javax.swing.JLabel numeroLeao;
    private javax.swing.JLabel numeroLibra;
    private javax.swing.JLabel numeroPeixes;
    private javax.swing.JLabel numeroSagitario;
    private javax.swing.JLabel numeroTouro;
    private javax.swing.JLabel numeroVirgem;
    private javax.swing.JLabel pMelhorarAquario;
    private javax.swing.JLabel pMelhorarAries;
    private javax.swing.JLabel pMelhorarCancer;
    private javax.swing.JLabel pMelhorarCapricornio;
    private javax.swing.JLabel pMelhorarEscorpiao;
    private javax.swing.JLabel pMelhorarGemeos;
    private javax.swing.JLabel pMelhorarLeao;
    private javax.swing.JLabel pMelhorarLibra;
    private javax.swing.JLabel pMelhorarPeixes;
    private javax.swing.JLabel pMelhorarSagitario;
    private javax.swing.JLabel pMelhorarTouro;
    private javax.swing.JLabel pMelhorarVirgem;
    private javax.swing.JPanel peixes;
    private javax.swing.JLabel periodoAquario;
    private javax.swing.JLabel periodoAries;
    private javax.swing.JLabel periodoCancer;
    private javax.swing.JLabel periodoCapricornio;
    private javax.swing.JLabel periodoEscorpiao;
    private javax.swing.JLabel periodoGemeos;
    private javax.swing.JLabel periodoLeao;
    private javax.swing.JLabel periodoLibra;
    private javax.swing.JLabel periodoPeixes;
    private javax.swing.JLabel periodoSagitario;
    private javax.swing.JLabel periodoTouro;
    private javax.swing.JLabel periodoVirgem;
    private javax.swing.JLabel pfortesAquario;
    private javax.swing.JLabel pfortesAries;
    private javax.swing.JLabel pfortesCancer;
    private javax.swing.JLabel pfortesCapricornio;
    private javax.swing.JLabel pfortesEscorpiao;
    private javax.swing.JLabel pfortesGemeos;
    private javax.swing.JLabel pfortesLeao;
    private javax.swing.JLabel pfortesLibra;
    private javax.swing.JLabel pfortesPeixes;
    private javax.swing.JLabel pfortesSagitario;
    private javax.swing.JLabel pfortesTouro;
    private javax.swing.JLabel pfortesVirgem;
    private javax.swing.JLabel planetaAquario;
    private javax.swing.JLabel planetaAries;
    private javax.swing.JLabel planetaCancer;
    private javax.swing.JLabel planetaCapricornio;
    private javax.swing.JLabel planetaEscorpiao;
    private javax.swing.JLabel planetaGemeos;
    private javax.swing.JLabel planetaLeao;
    private javax.swing.JLabel planetaLibra;
    private javax.swing.JLabel planetaPeixes;
    private javax.swing.JLabel planetaSagitario;
    private javax.swing.JLabel planetaTouro;
    private javax.swing.JLabel planetaVirgem;
    private javax.swing.JLabel previsaoAquario;
    private javax.swing.JLabel previsaoAries;
    private javax.swing.JLabel previsaoCancer;
    private javax.swing.JLabel previsaoCapricornio;
    private javax.swing.JLabel previsaoEscorpiao;
    private javax.swing.JLabel previsaoGemeos;
    private javax.swing.JLabel previsaoLeao;
    private javax.swing.JLabel previsaoLibra;
    private javax.swing.JLabel previsaoPeixes;
    private javax.swing.JLabel previsaoSagitario;
    private javax.swing.JLabel previsaoTouro;
    private javax.swing.JLabel previsaoVirgem;
    private javax.swing.JPanel sagitario;
    private javax.swing.JLabel saudeAquario;
    private javax.swing.JLabel saudeAries;
    private javax.swing.JLabel saudeCancer;
    private javax.swing.JLabel saudeCapricornio;
    private javax.swing.JLabel saudeEscorpiao;
    private javax.swing.JLabel saudeGemeos;
    private javax.swing.JLabel saudeLeao;
    private javax.swing.JLabel saudeLibra;
    private javax.swing.JLabel saudePeixes;
    private javax.swing.JLabel saudeSagitario;
    private javax.swing.JLabel saudeTouro;
    private javax.swing.JLabel saudeVirgem;
    private javax.swing.JLabel signo;
    private javax.swing.JLabel signo1;
    private javax.swing.JLabel sorteAquario;
    private javax.swing.JLabel sorteAries;
    private javax.swing.JLabel sorteCancer;
    private javax.swing.JLabel sorteCapricornio;
    private javax.swing.JLabel sorteEscorpiao;
    private javax.swing.JLabel sorteGemeos;
    private javax.swing.JLabel sorteLeao;
    private javax.swing.JLabel sorteLibra;
    private javax.swing.JLabel sortePeixes;
    private javax.swing.JLabel sorteSagitario;
    private javax.swing.JLabel sorteTouro;
    private javax.swing.JLabel sorteVirgem;
    private javax.swing.JTextField tfAmorAquario;
    private javax.swing.JTextField tfAmorAries;
    private javax.swing.JTextField tfAmorCancer;
    private javax.swing.JTextField tfAmorCapricornio;
    private javax.swing.JTextField tfAmorEscorpiao;
    private javax.swing.JTextField tfAmorGemeos;
    private javax.swing.JTextField tfAmorLeao;
    private javax.swing.JTextField tfAmorLibra;
    private javax.swing.JTextField tfAmorPeixes;
    private javax.swing.JTextField tfAmorSagitario;
    private javax.swing.JTextField tfAmorTouro;
    private javax.swing.JTextField tfAmorVirgem;
    private javax.swing.JTextField tfCompatibilidade;
    private javax.swing.JTextField tfCorAquario;
    private javax.swing.JTextField tfCorAries;
    private javax.swing.JTextField tfCorCancer;
    private javax.swing.JTextField tfCorCapricornio;
    private javax.swing.JTextField tfCorEscorpiao;
    private javax.swing.JTextField tfCorGemeos;
    private javax.swing.JTextField tfCorLeao;
    private javax.swing.JTextField tfCorLibra;
    private javax.swing.JTextField tfCorPeixes;
    private javax.swing.JTextField tfCorSagitario;
    private javax.swing.JTextField tfCorTouro;
    private javax.swing.JTextField tfCorVirgem;
    private javax.swing.JTextField tfElementoAquario;
    private javax.swing.JTextField tfElementoAries;
    private javax.swing.JTextField tfElementoCancer;
    private javax.swing.JTextField tfElementoCapricornio;
    private javax.swing.JTextField tfElementoEscorpiao;
    private javax.swing.JTextField tfElementoGemeos;
    private javax.swing.JTextField tfElementoLeao;
    private javax.swing.JTextField tfElementoLibra;
    private javax.swing.JTextField tfElementoPeixes;
    private javax.swing.JTextField tfElementoSagitario;
    private javax.swing.JTextField tfElementoTouro;
    private javax.swing.JTextField tfElementoVirgem;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfNumeroAquario;
    private javax.swing.JTextField tfNumeroAries;
    private javax.swing.JTextField tfNumeroCancer;
    private javax.swing.JTextField tfNumeroCapricornio;
    private javax.swing.JTextField tfNumeroEscorpiao;
    private javax.swing.JTextField tfNumeroGemeos;
    private javax.swing.JTextField tfNumeroLeao;
    private javax.swing.JTextField tfNumeroLibra;
    private javax.swing.JTextField tfNumeroPeixes;
    private javax.swing.JTextField tfNumeroSagitario;
    private javax.swing.JTextField tfNumeroTouro;
    private javax.swing.JTextField tfNumeroVirgem;
    private javax.swing.JTextField tfPeriodoAquario;
    private javax.swing.JTextField tfPeriodoAries;
    private javax.swing.JTextField tfPeriodoCancer;
    private javax.swing.JTextField tfPeriodoCapricornio;
    private javax.swing.JTextField tfPeriodoEscorpiao;
    private javax.swing.JTextField tfPeriodoGemeos;
    private javax.swing.JTextField tfPeriodoLeao;
    private javax.swing.JTextField tfPeriodoLibra;
    private javax.swing.JTextField tfPeriodoPeixes;
    private javax.swing.JTextField tfPeriodoSagitario;
    private javax.swing.JTextField tfPeriodoTouro;
    private javax.swing.JTextField tfPeriodoVirgem;
    private javax.swing.JTextField tfPlanetaAquario;
    private javax.swing.JTextField tfPlanetaAries;
    private javax.swing.JTextField tfPlanetaCancer;
    private javax.swing.JTextField tfPlanetaCapricornio;
    private javax.swing.JTextField tfPlanetaEscorpiao;
    private javax.swing.JTextField tfPlanetaGemeos;
    private javax.swing.JTextField tfPlanetaLeao;
    private javax.swing.JTextField tfPlanetaLibra;
    private javax.swing.JTextField tfPlanetaPeixes;
    private javax.swing.JTextField tfPlanetaSagitario;
    private javax.swing.JTextField tfPlanetaTouro;
    private javax.swing.JTextField tfPlanetaVirgem;
    private javax.swing.JTextField tfSaudeAquario;
    private javax.swing.JTextField tfSaudeAries;
    private javax.swing.JTextField tfSaudeCancer;
    private javax.swing.JTextField tfSaudeCapricornio;
    private javax.swing.JTextField tfSaudeEscorpiao;
    private javax.swing.JTextField tfSaudeGemeos;
    private javax.swing.JTextField tfSaudeLeao;
    private javax.swing.JTextField tfSaudeLibra;
    private javax.swing.JTextField tfSaudePeixes;
    private javax.swing.JTextField tfSaudeSagitario;
    private javax.swing.JTextField tfSaudeTouro;
    private javax.swing.JTextField tfSaudeVirgem;
    private javax.swing.JTextField tfSorteAquario;
    private javax.swing.JTextField tfSorteAries;
    private javax.swing.JTextField tfSorteCancer;
    private javax.swing.JTextField tfSorteCapricornio;
    private javax.swing.JTextField tfSorteEscorpiao;
    private javax.swing.JTextField tfSorteGemeos;
    private javax.swing.JTextField tfSorteLeao;
    private javax.swing.JTextField tfSorteLibra;
    private javax.swing.JTextField tfSortePeixes;
    private javax.swing.JTextField tfSorteSagitario;
    private javax.swing.JTextField tfSorteTouro;
    private javax.swing.JTextField tfSorteVirgem;
    private javax.swing.JTextField tfTrabalhoAquario;
    private javax.swing.JTextField tfTrabalhoAries;
    private javax.swing.JTextField tfTrabalhoCancer;
    private javax.swing.JTextField tfTrabalhoCapricornio;
    private javax.swing.JTextField tfTrabalhoEscorpiao;
    private javax.swing.JTextField tfTrabalhoGemeos;
    private javax.swing.JTextField tfTrabalhoLeao;
    private javax.swing.JTextField tfTrabalhoLibra;
    private javax.swing.JTextField tfTrabalhoPeixes;
    private javax.swing.JTextField tfTrabalhoSagitario;
    private javax.swing.JTextField tfTrabalhoTouro;
    private javax.swing.JTextField tfTrabalhoVirgem;
    private javax.swing.JLabel tituloAquario;
    private javax.swing.JLabel tituloAries;
    private javax.swing.JLabel tituloCancer;
    private javax.swing.JLabel tituloCapricornio;
    private javax.swing.JLabel tituloCarecteristicasAquario;
    private javax.swing.JLabel tituloCarecteristicasAries;
    private javax.swing.JLabel tituloCarecteristicasAries1;
    private javax.swing.JLabel tituloCarecteristicasCancer;
    private javax.swing.JLabel tituloCarecteristicasCapricornio;
    private javax.swing.JLabel tituloCarecteristicasEscorpiao;
    private javax.swing.JLabel tituloCarecteristicasGemeos;
    private javax.swing.JLabel tituloCarecteristicasLeao;
    private javax.swing.JLabel tituloCarecteristicasLibra;
    private javax.swing.JLabel tituloCarecteristicasPeixes;
    private javax.swing.JLabel tituloCarecteristicasSagitario;
    private javax.swing.JLabel tituloCarecteristicasVirgem;
    private javax.swing.JLabel tituloCompatibilidade;
    private javax.swing.JLabel tituloDescobrirSigno;
    private javax.swing.JLabel tituloEnergiaAquario;
    private javax.swing.JLabel tituloEnergiaAries;
    private javax.swing.JLabel tituloEnergiaAries1;
    private javax.swing.JLabel tituloEnergiaCancer;
    private javax.swing.JLabel tituloEnergiaCapricornio;
    private javax.swing.JLabel tituloEnergiaEscorpiao;
    private javax.swing.JLabel tituloEnergiaGemeos;
    private javax.swing.JLabel tituloEnergiaLeao;
    private javax.swing.JLabel tituloEnergiaLibra;
    private javax.swing.JLabel tituloEnergiaPeixes;
    private javax.swing.JLabel tituloEnergiaSagitario;
    private javax.swing.JLabel tituloEnergiaVirgem;
    private javax.swing.JLabel tituloEscorpiao;
    private javax.swing.JLabel tituloGemeos;
    private javax.swing.JLabel tituloLeao;
    private javax.swing.JLabel tituloLibra;
    private javax.swing.JLabel tituloMensagemAquario;
    private javax.swing.JLabel tituloMensagemAries;
    private javax.swing.JLabel tituloMensagemCancer;
    private javax.swing.JLabel tituloMensagemCapricornio;
    private javax.swing.JLabel tituloMensagemEscorpiao;
    private javax.swing.JLabel tituloMensagemGemeos;
    private javax.swing.JLabel tituloMensagemLeao;
    private javax.swing.JLabel tituloMensagemLibra;
    private javax.swing.JLabel tituloMensagemPeixes;
    private javax.swing.JLabel tituloMensagemSagitario;
    private javax.swing.JLabel tituloMensagemTouro;
    private javax.swing.JLabel tituloMensagemVirgem;
    private javax.swing.JLabel tituloPeixes;
    private javax.swing.JLabel tituloSagitario;
    private javax.swing.JLabel tituloTouro;
    private javax.swing.JLabel tituloVirgem;
    private javax.swing.JPanel touro;
    private javax.swing.JLabel trabalhoAquario;
    private javax.swing.JLabel trabalhoAries;
    private javax.swing.JLabel trabalhoCancer;
    private javax.swing.JLabel trabalhoCapricornio;
    private javax.swing.JLabel trabalhoEscorpiao;
    private javax.swing.JLabel trabalhoGemeos;
    private javax.swing.JLabel trabalhoLeao;
    private javax.swing.JLabel trabalhoLibra;
    private javax.swing.JLabel trabalhoPeixes;
    private javax.swing.JLabel trabalhoSagitario;
    private javax.swing.JLabel trabalhoTouro;
    private javax.swing.JLabel trabalhoVirgem;
    private javax.swing.JTextArea txFortesAquario;
    private javax.swing.JTextArea txFortesAries;
    private javax.swing.JTextArea txFortesCancer;
    private javax.swing.JTextArea txFortesCapricornio;
    private javax.swing.JTextArea txFortesEscorpiao;
    private javax.swing.JTextArea txFortesGemeos;
    private javax.swing.JTextArea txFortesLeao;
    private javax.swing.JTextArea txFortesLibra;
    private javax.swing.JTextArea txFortesPeixes;
    private javax.swing.JTextArea txFortesSagitario;
    private javax.swing.JTextArea txFortesTouro;
    private javax.swing.JTextArea txFortesVirgem;
    private javax.swing.JTextArea txMelhorarAquario;
    private javax.swing.JTextArea txMelhorarAries;
    private javax.swing.JTextArea txMelhorarCancer;
    private javax.swing.JTextArea txMelhorarCapricornio;
    private javax.swing.JTextArea txMelhorarEscorpiao;
    private javax.swing.JTextArea txMelhorarGemeos;
    private javax.swing.JTextArea txMelhorarLeao;
    private javax.swing.JTextArea txMelhorarLibra;
    private javax.swing.JTextArea txMelhorarPeixes;
    private javax.swing.JTextArea txMelhorarSagitario;
    private javax.swing.JTextArea txMelhorarTouro;
    private javax.swing.JTextArea txMelhorarVirgem;
    private javax.swing.JTextArea txMensagemAquario;
    private javax.swing.JTextArea txMensagemAries;
    private javax.swing.JTextArea txMensagemCancer;
    private javax.swing.JTextArea txMensagemCapricornio;
    private javax.swing.JTextArea txMensagemEscorpiao;
    private javax.swing.JTextArea txMensagemGemeos;
    private javax.swing.JTextArea txMensagemLeao;
    private javax.swing.JTextArea txMensagemLibra;
    private javax.swing.JTextArea txMensagemPeixes;
    private javax.swing.JTextArea txMensagemSagitario;
    private javax.swing.JTextArea txMensagemTouro;
    private javax.swing.JTextArea txMensagemVirgem;
    private javax.swing.JScrollPane txPrevisao;
    private javax.swing.JTabbedPane txPrevisaoAquario;
    private javax.swing.JScrollPane txPrevisaoAries1;
    private javax.swing.JScrollPane txPrevisaoAries10;
    private javax.swing.JScrollPane txPrevisaoAries11;
    private javax.swing.JScrollPane txPrevisaoAries2;
    private javax.swing.JScrollPane txPrevisaoAries3;
    private javax.swing.JScrollPane txPrevisaoAries4;
    private javax.swing.JScrollPane txPrevisaoAries5;
    private javax.swing.JScrollPane txPrevisaoAries6;
    private javax.swing.JScrollPane txPrevisaoAries7;
    private javax.swing.JScrollPane txPrevisaoAries8;
    private javax.swing.JScrollPane txPrevisaoAries9;
    private javax.swing.JTextArea txtPrevisaoAquarios;
    private javax.swing.JTextArea txtPrevisaoAries;
    private javax.swing.JTextArea txtPrevisaoCancer;
    private javax.swing.JTextArea txtPrevisaoCapricornio;
    private javax.swing.JTextArea txtPrevisaoEscorpiao;
    private javax.swing.JTextArea txtPrevisaoGemeos;
    private javax.swing.JTextArea txtPrevisaoLeao;
    private javax.swing.JTextArea txtPrevisaoLibra;
    private javax.swing.JTextArea txtPrevisaoPeixes;
    private javax.swing.JTextArea txtPrevisaoSagitario;
    private javax.swing.JTextArea txtPrevisaoTouro;
    private javax.swing.JTextArea txtPrevisaoVirgem;
    private javax.swing.JPanel virgem;
    // End of variables declaration//GEN-END:variables
}
