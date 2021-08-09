package patientAdministrationService;

import java.util.ArrayList;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import patientAdministrationService.PatientAdministrationServiceGrpc.PatientAdministrationServiceBlockingStub;
import patientAdministrationService.PatientAdministrationServiceGrpc.PatientAdministrationServiceStub;

public class PatientAdministrationClient {
	
	static ArrayList<String> patientsList = new ArrayList<String>();
	
	private static PatientAdministrationServiceBlockingStub adminBlockingStub;
	private static PatientAdministrationServiceStub adminAsyncStub;

	public static void main(String[] args) {
	
		ManagedChannel adminChannel = ManagedChannelBuilder.
							forAddress("localhost", 50052)
							.usePlaintext()
							.build();
		
		//stubs -- generate from proto
		adminBlockingStub = PatientAdministrationServiceGrpc.newBlockingStub(adminChannel);
		adminAsyncStub = PatientAdministrationServiceGrpc.newStub(adminChannel);
		
		registerPatient();
		//displayPatients();
		calculatePrice();

	}
	
	//Client Streaming
	//Register Patients service
	public static void registerPatient() {
		
		StreamObserver<RegisterResponse> responseObserver = new StreamObserver<RegisterResponse>() {

			@Override
			public void onNext(RegisterResponse value) {
				System.out.println("Patient Registered with, " + value.getResult());
				patientsList.add(value.getResult());		
			}

			@Override
			public void onError(Throwable t) {
				t.printStackTrace();				
			}

			@Override
			public void onCompleted() {
				System.out.println("Patient registering completed.\n");	
				System.out.println("---------------------------------------------------\n");
				
			}			
		};
		
		StreamObserver<RegisterRequest> requestObserver = adminAsyncStub.registerPatient(responseObserver);
		requestObserver.onNext(RegisterRequest.newBuilder()
											.setName("Grigor Danut")
											.setAge("51")
											.setGender("Male")
											.build());	
				
		//Mark the end of requests
		requestObserver.onCompleted();
		
		try {
			//Wait a bit
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
//	public static void displayPatients() {	
//		
//		for(int i = 0; i < patientsList.size(); i++) {			
//		
//			DisplayRequest request = DisplayRequest.newBuilder().setPatList(patientsList.get(i)).build();
//		
//			StreamObserver<DisplayResponse> responseObserver = new StreamObserver<DisplayResponse>() {
//
//				@Override
//				public void onNext(DisplayResponse value) {
//					System.out.println("Patients list: " + value.getAllPatients());				
//				}
//
//				@Override
//				public void onError(Throwable t) {
//					t.printStackTrace();				
//				}
//
//				@Override
//				public void onCompleted() {
//					System.out.println("Displaying patient list request completed.");
//				
//				}			
//			};
//		
//			adminAsyncStub.displayPatients(request, responseObserver);
//		}
//	}
	
	public static void calculatePrice () {
		
		int noDays = 2;
		String patName = "Grigor Danut";
		
		CalculateRequest request = CalculateRequest.newBuilder().setPatName(patName).setNumberDays(noDays).build();
		CalculateResponse response = adminBlockingStub.calculatePrice(request);
		
		System.out.println(response.getMessage());
		System.out.println("Patient calculate Accommodation Price completed.");	
		
	}

}