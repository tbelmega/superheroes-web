package de.oncoding.superheroesweb;

import de.oncoding.superheroesweb.model.Superhero;
import de.oncoding.superheroesweb.model.Superpower;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SuperheroController {

    private static final Superpower[] superpowers = {
            new Superpower("Mushroom", "Mario grows into Super Mario"),
            new Superpower("Fire Flower", "Mario throws fire balls"),
            new Superpower("Super Star", "Mario is invulnerable")
    };

    private static Superhero[] heroes = new Superhero[]{
            new Superhero("Mario", superpowers),
            new Superhero("Luigi", superpowers),
            null,
            null,
            null
    };

    @GetMapping("/superheroes")
    public String getSuperheroes(
            Model model
    ) {
        model.addAttribute("heroes", heroes);
        return "heroes";
    }

    @GetMapping("/superheroes/{id}")
    public String getSuperhero(
            Model model,
            @PathVariable String id
    ) {
        Superhero hero = null;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i] != null && heroes[i].getId().equals(id)) {
                hero = heroes[i];
                break;
            }
        }

        model.addAttribute("hero", hero);
        return "hero";
    }

    @GetMapping("/superheroes/create")
    public String createSuperhero() {
        return "createHero";
    }

    @PostMapping("/superheroes/create")
    public String submitSuperhero(
            Model model,
            String heroName,
            String power1Name,
            String power1Description,
            String power2Name,
            String power2Description,
            String power3Name,
            String power3Description
    ) {

        Superhero createdHero = new Superhero(heroName, new Superpower[]{
                new Superpower(power1Name, power1Description),
                new Superpower(power2Name, power2Description),
                new Superpower(power3Name, power3Description)
        });

        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i] == null) {
                heroes[i] = createdHero;
                break;
            }
        }

        return getSuperheroes(model);
    }

}
