package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
class PropertyInjectedGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello World - Property";
    }
}