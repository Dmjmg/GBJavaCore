package ru.javacore.lesson1;

public class Team {
    String name; String[] member;
    public Team(String name, String[] member){
        this.name = name;
        this.member = member;
    }
    public void strOut(String[] mem){
        for (int i = 0; i < mem.length; i++){
            System.out.print(mem[i]+" ");
        }
    }

    public void showResults() {
        System.out.print("Команда "+ name+" прошла дистанцию в составе "); strOut(member);

    }



}
class Course{
    String[] obstacle;
    public Course(String[] obstacle){
        this.obstacle = obstacle;

    }
    public void doIt(Team team) {
        System.out.println("Команда "+team.name+" проходит полосу препятсвий");
    }
}
 class AppTeam {

    public static void main(String[] args){
        Course c = new Course(new String[]{"Земейка", "Гора", "Бассейн"});
        Team team = new Team("Champions", new String[]{"Ivan", "Bob", "Jon", "Rob"});
        c.doIt(team);
        team.showResults();
    }
}