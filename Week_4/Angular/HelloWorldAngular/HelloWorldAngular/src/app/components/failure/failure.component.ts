import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { LoggingService } from '../../services/logging.service';

@Component({
  selector: 'app-failure',
  templateUrl: './failure.component.html',
  styleUrls: ['./failure.component.css'],
  providers: [LoggingService]
})
export class FailureComponent implements OnInit {

  @Input()
  closed = false;

  @Output()
  notify: EventEmitter<boolean> = new EventEmitter<boolean>();

  message = `FATALITY`;

  detailedText = `FLAWLESS VICTORY`;

  constructor(private logger: LoggingService) { }

  closeMessage(): void {

    this.closed = true;
    this.notify.emit(true);
    this.logger.log('ok', 'failure component closes');

  }

  ngOnInit() {
  }

}
