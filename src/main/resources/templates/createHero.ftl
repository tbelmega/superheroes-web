<#import "/_master.ftl" as master>
<@master.template>

    <h1>Create new hero</h1>
    <form method="post" action="/superheroes/create">
        <label>Name:</label>
        <input type="text" name="heroName"/>

        <h2>Supers:</h2>
        <ol>
            <li>
                <label>Name:</label>
                <input type="text" name="power1Name">
                <label>Description:</label>
                <input type="text" name="power1Description">
            </li>
            <li>
                <label>Name:</label>
                <input type="text" name="power2Name">
                <label>Description:</label>
                <input type="text" name="power2Description">
            </li>
            <li>
                <label>Name:</label>
                <input type="text" name="power3Name">
                <label>Description:</label>
                <input type="text" name="power3Description">
            </li>
        </ol>

        <button type="submit">Create</button>
    </form>

</@master.template>