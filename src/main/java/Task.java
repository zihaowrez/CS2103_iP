public abstract class Task {

    protected String description;
    protected boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public Task(String description, Boolean isDone) {
        this.description = description;
        this.isDone = isDone;
    }

    @Override
    public String toString() {
        if (isDone) {
            return "[X] " + description;
        } else {
            return "[ ] " + description;
        }
    }

    public int getStatus() {
        return isDone ? 1 : 0;
    }

    public abstract String getDescription();

    public abstract String getIcon();

    public abstract Task mark();

    public abstract Task unmark();

}
