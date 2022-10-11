import {Component, Inject, OnInit} from '@angular/core';
import {Transaction} from '../../model/transaction';
import {TransactionService} from '../../service/transaction.service';
import {MAT_DIALOG_DATA, MatDialog, MatDialogRef} from '@angular/material/dialog';
import {CustomerService} from '../../service/customer.service';
import {ActivatedRoute, Router} from '@angular/router';
import {DeleteTransactionComponent} from '../delete-transaction/delete-transaction.component';

@Component({
  selector: 'app-detail-transaction',
  templateUrl: './detail-transaction.component.html',
  styleUrls: ['./detail-transaction.component.css']
})
export class DetailTransactionComponent implements OnInit {
  transaction: Transaction;
  id: number;
  message: string;

  constructor(private transactionService: TransactionService,

              public dialogDetail: MatDialogRef<TransactionService>,
              @Inject(MAT_DIALOG_DATA) public data: any,

              private customerService: CustomerService,
              private router: Router,
              private activatedRoute: ActivatedRoute,
              private dialog:MatDialog
  ) {
  }

  ngOnInit(): void {
    console.log("----");
    this.id = this.data.id
    console.log(this.id)
    console.log("----");

    // this.activatedRoute.paramMap.subscribe((param: ParamMap) => {
    //   this.id = +param.get('id');
    // });
    this.getCustomer()

  }

  getCustomer() {
    return this.transactionService.findByID(this.id).subscribe(value => {
      this.transaction = value;
    }, error => {
      console.log(error);
    }, () => {
      console.log(this.transaction);
    });
  }

  deleteDialog(id: number) {
    const dialogRef = this.dialog.open(DeleteTransactionComponent, {
      width: '700px',
      data: {id: id},
    });
    dialogRef.afterClosed().subscribe(value1 => {
      this.dialogDetail.close();
      console.log('The dialog edit was closed!');
    });
  }
  back() {
    this.dialogDetail.close();
  }
}
