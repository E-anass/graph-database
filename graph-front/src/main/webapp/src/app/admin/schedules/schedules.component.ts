import {Component, OnInit, ViewChild} from '@angular/core';
import {WebService} from "../../core/service/web.service";
import {map} from "rxjs/operators";
import {MatTableDataSource} from "@angular/material/table";
import {Schedule} from "../../core/module/schedule";
import {MatPaginator} from "@angular/material/paginator";

@Component({
  selector: 'app-schedules',
  templateUrl: './schedules.component.html',
  styleUrls: ['./schedules.component.css']
})
export class SchedulesComponent implements OnInit {

  displayedColumns: string[] = ['id', 'label', 'cron', 'lastUpdate', 'nextUpdate','actions'];
  dataSource: any;
  @ViewChild(MatPaginator, {static: true}) paginator: MatPaginator;

  constructor(private webService: WebService) {
  }

  ngOnInit(): void {
    this.webService.getSchedules()
      .pipe(
        map(data=>data._embedded.schedules.map(sc=>this.asSchedule(sc)))
      )
      .subscribe(
        data =>  this.buildTable(data) ,
        error => console.log(error)
      );
  }

  private buildTable(data:Schedule[]){
    this.dataSource = new MatTableDataSource<Schedule>(data);
    this.dataSource.paginator = this.paginator;
  }

  private asSchedule(object: any){
    return {
      "id":object.id,
      "cron": object.cron,
      "label": object.label,
      "lastUpdate": object.lastUpdate,
      "nextUpdate": object.nextUpdate
    }
  }
  applyFilter(event: Event) {
    const filterValue = (event.target as HTMLInputElement).value;
    this.dataSource.filter = filterValue.trim().toLowerCase();
  }

  getRecord(name: any) {
    alert(name)
  }
}
