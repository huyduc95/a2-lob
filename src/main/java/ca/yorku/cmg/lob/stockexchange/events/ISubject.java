package ca.yorku.cmg.lob.stockexchange.events;

public interface ISubject {

        // Attach an observer to the subject
        // @param o the observer to attach
        // Detach an observer from the subject
        // @param o the observer to detach
        // Notify all observers of a change in the subject
        // @param e the event to notify observers about
        void attach(IObserver o);
        void detach(IObserver o);
        void notifyObservers(Event e);
}
