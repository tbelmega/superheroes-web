<#import "/_master.ftl" as master>
<@master.template>
<h1>My heroes</h1>

<div>
    <ol>
        <#list heroes as hero>
            <li>
                <#if hero??>
                    <a href="/superheroes/${hero.id}">
                        <strong>${hero.name}</strong>
                    </a>
                <#else>
                    <a href="/superheroes/create">
                        Create new hero
                    </a>
                </#if>
            </li>
        </#list>
    </ol>

</div>
</@master.template>