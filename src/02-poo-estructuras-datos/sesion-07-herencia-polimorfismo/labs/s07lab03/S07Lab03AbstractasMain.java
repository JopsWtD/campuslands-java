package s07lab03;

public class S07Lab03AbstractasMain {
    public static void mostrarPlan(PlanEntrenamiento plan) {
        System.out.printf("Plan: %s | Duración: %d minutos %n", plan.getNombre(), plan.duracionMinutos());
    }

    public static void main(String[] args) {
        PlanEntrenamiento fuerza = new PlanFuerza();
        PlanEntrenamiento cardio = new PlanCardio();
        mostrarPlan(fuerza);
        mostrarPlan(cardio);
    }
}
