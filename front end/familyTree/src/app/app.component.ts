import { Component } from '@angular/core';
import {Branch} from "./shared/models/branch";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'familyTree';
  public branch : Branch[];
}
