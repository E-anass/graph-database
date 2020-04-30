import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {SchedulesComponent} from "./schedules/schedules.component";
import {AngularMaterialModule} from "../angular-material.module";


@NgModule({
  declarations: [
    SchedulesComponent
  ],
  imports: [
    CommonModule,
    AngularMaterialModule,
  ],

})
export class AdminModule { }
