/* Nama	: Dea Amelia Setyorini */
/* NIM	: 2100018445 */
#include <iostream>
using namespace std;

int main(){
	int array[5];
	int i;
	cout<<"=================================================\n";
	cout<<"                   Program C++\n";
	cout<<"       Pencarian Data Pada Array 1 Dimensi \n";
	cout<<"=================================================\n"; //judul program
	cout<<"Inputkan data\n";
	for(int i=0; i<5; i++){
		cout<<"Nilai ke "<<i+1<<" : ";  //input nilai array 1d
		cin>>array[i];
	}
	cout<<endl;
	cout<<"\nHasil output\n";
	for(int i=0; i<5; i++){
		cout<<"Nilai ke "<<i+1<<" : "<<array[i]<<endl;
	}
	cout<<"=================================================\n";
	cout<<"             Nilai Ganjil dan Genap\n";
	cout<<"=================================================\n";
	for (int i=0; i<5; i++){
		if (array[i]%2 == 0)
		{
			cout<<"Nilai Genap adalah "<<array[i]<<endl; //output array 1d genap
		}
	}
	cout<<endl;
	for (int i=0; i<10; i++){
		if (array[i]%2 != 0)
		{
			cout<<"Nilai Ganjil adalah "<<array[i]<<endl; //output array 1d ganjil
		}
	}
	cout<<endl<<endl;
	cout<<"=================================================\n";
	cout<<"                   Program C++\n";
	cout<<"       Pencarian Data Pada Array 2 Dimensi \n";      //judul program
	cout<<"=================================================\n";
	int a,b;
	char ulang;
	cout<<"Masukkan jumlah baris : "; cin>>a;
	cout<<"Masukkan jumlah kolom : "; cin>>b; //input indeks array 2d
	int ar[a][b];
	cout<<"Anda akan menggunakan Matrix "<<a<<"x"<<b<<endl;
	cout<<"-------------------------------------------------\n";
	for (int i=0; i<=a-1; i++){
		for (int j=0; j<=b-1; j++){
			cout<<"Masukkan data baris ke-"<<i<<" kolom ke-"<<j<<": "; cin>>ar[i][j]; //input array 2d
		}
		if(i==a-1){
				cout<<"=================================================\n";
		}
		else{
			cout<<"-------------------------------------------------\n";
		}
	}
	cout<<"Model Matrix\n";
	for (int i=0; i<=a-1; i++){
		for(int j=0; j<=b-1; j++){
			cout<<ar[i][j]<<"\t";  //output array 2d
		}
		cout<<endl;
	}
	int pilih;
	do{
		cout<<"=================================================\n";
		cout<<"                      MENU\n";
		cout<<"=================================================\n";  //menu program
		cout<<"1. Elemen Genap "<<endl;
		cout<<"2. Elemen Ganjil "<<endl;
		cout<<"Masukkan Pilihan Anda : "; cin>>pilih;
		if (pilih == 1){
			cout<<"Elemen genapnya : ";
			for (int i=0; i<=a-1; i++){
				for(int j=0; j<=b-1; j++){
					if (ar[i][j]%2==0){
						cout<<ar[i][j]<<" ";  //output array 2d genap
						break;
					}	
				}
			}	
		}
		else if (pilih == 2){
			cout<<"Elemen ganjilnya : ";
			for (int i=0; i<=a-1; i++){
				for(int j=0; j<=b-1; j++){
					if (ar[i][j]%2 != 0 ){
						cout<<ar[i][j]<<" "; //output array 2d ganjil
						break;
					}
				}
			}
		}
		cout<<"\n\nPilih menu yang lain ? (y/t) : "; cin>>ulang;
		cout<<endl;
	}
	while (ulang != 't');
	return 0;
}	
