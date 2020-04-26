import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MainMenuComponent } from './layout/main-menu/main-menu.component';
import { SideBarComponent } from './layout/side-bar/side-bar.component';
import { ContentComponent } from './content/content.component';


@NgModule({
  declarations: [
    AppComponent,
    MainMenuComponent,
    SideBarComponent,
    ContentComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
