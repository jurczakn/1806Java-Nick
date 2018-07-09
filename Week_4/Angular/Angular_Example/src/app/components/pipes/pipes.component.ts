import { Component } from '@angular/core';

@Component({
    selector: 'app-pipes',
    templateUrl: './pipes.component.html'

})
export class PipesComponent {

    superPowers: Array<string> = ['flight', 'super strength', 'insomnia', 'omnipotence', 'magic', 'charm', 'heat vision', 'being rich', 'imortality', 'time control'];

    searchTerm = '';

    public getStyle() {

        return {

            color: `red`,
            background: `yellow`,
            font: `comic-sans`

        };

    }

}
