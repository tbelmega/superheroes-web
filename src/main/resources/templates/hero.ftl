<#import "/_master.ftl" as master>
<@master.template>

<body>
<h1>${hero.name}</h1>
<p>Hitpoints: ${hero.healthPointsCurrent}/${hero.healthPointsMax}</p>
<p>Experience: ${hero.experiencePoints}</p>
<p>Ready to fight: ${hero.readyToFight?c}</p>
<p>Alive: ${hero.alive?c}</p>
<h3>Superpowers:</h3>
<ul>
    <li>
        <p>${hero.superpowers[0].name} (${hero.superpowers[0].actionDescription})</p>
    </li>
    <li>
        <p>${hero.superpowers[1].name} (${hero.superpowers[1].actionDescription})</p>
    </li>
    <li>
        <p>${hero.superpowers[2].name} (${hero.superpowers[2].actionDescription})</p>
    </li>
</ul>
<a href="/superheroes">Back to overview</a>
</@master.template>