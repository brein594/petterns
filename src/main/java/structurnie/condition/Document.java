package structurnie.condition;

import lombok.Setter;

@Setter
public class Document implements DocumentState {
    private DocumentState state;

    public Document() {
        state = new Draft(this);
    }

    @Override
    public void proceed() {
        state.proceed();
    }

    @Override
    public void reject() {
        state.reject();
    }
}
