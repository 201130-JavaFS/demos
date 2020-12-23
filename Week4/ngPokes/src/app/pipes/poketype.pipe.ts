import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'poketype'
})
export class PoketypePipe implements PipeTransform {

  transform(value:string): string {
    return ", "+value;
  }

}
