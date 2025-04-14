package structurnie.condition;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class New implements DocumentState {
    private Document context;

    @Override
    public void proceed() {
        System.out.println("procced new document");
        context.setState(new Saved(context));
    }

    @Override
    public void reject() {
        System.out.println("Rejaect new document");
        context.setState(new Draft(context));
    }
}
