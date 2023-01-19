import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("java 8");
        curso1.setCargaHoraria(3);
        curso1.setDescricao("dominando lambdas");

        Curso curso2 = new Curso();
        curso2.setTitulo("spring boot");
        curso2.setCargaHoraria(5);
        curso2.setDescricao("criando apis");

        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("Mentoria Java");
        mentoriaJava.setDescricao("Mentoria OO");
        mentoriaJava.setData(LocalDate.now());

        Mentoria mentoriaSpring = new Mentoria();
        mentoriaSpring.setTitulo("Mentoria spring");
        mentoriaSpring.setDescricao("Mentoria spring");
        mentoriaSpring.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Java backend");
        bootcamp.setDescricao("formacao backend");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoriaJava);
        bootcamp.getConteudos().add(mentoriaSpring);

        Dev devAkin = new Dev();
        devAkin.setNome("Akin");
        devAkin.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Akin " + devAkin.getConteudosInscritos());
        devAkin.progredir();

        System.out.println("---");
        System.out.println("Xp: " + devAkin.calcularXp());
        System.out.println("Conteúdos inscritos Akin " + devAkin.getConteudosInscritos());
        System.out.println("Conteúdos finalizados Akin " + devAkin.getConteudosConcluios());

        System.out.println("===============");

        Dev devTaina = new Dev();
        devTaina.setNome("Akin");
        devTaina.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos inscritos Tainá " + devTaina.getConteudosInscritos());
        devTaina.progredir();
        devTaina.progredir();

        System.out.println("---");
        System.out.println("Xp: " + devTaina.calcularXp());
        System.out.println("Conteúdos inscritos Tainá " + devTaina.getConteudosInscritos());
        System.out.println("Conteúdos finalizados Tainá " + devTaina.getConteudosConcluios());



    }
}