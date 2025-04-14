package structurnie.condition;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Saved implements DocumentState {
    private Document context;

    @Override
    public void proceed() {
        System.out.println("Document was saved");
    }

    @Override
    public void reject() {
        System.out.println("Reject Saved document");
        context.setState(new New(context));
    }
}
