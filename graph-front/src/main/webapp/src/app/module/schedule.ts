export class Schedule {

  private _id: Number;
  private _cron: string;
  private _lastUpdate: Date;
  private _nextUpdate: Date;

  constructor() {
  }

  get id(): Number {
    return this._id;
  }

  set id(value: Number) {
    this._id = value;
  }

  get cron(): string {
    return this._cron;
  }

  set cron(value: string) {
    this._cron = value;
  }

  get lastUpdate(): Date {
    return this._lastUpdate;
  }

  set lastUpdate(value: Date) {
    this._lastUpdate = value;
  }

  get nextUpdate(): Date {
    return this._nextUpdate;
  }

  set nextUpdate(value: Date) {
    this._nextUpdate = value;
  }
}
